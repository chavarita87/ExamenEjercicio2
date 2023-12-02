/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package developer.marvel.com.service.impl;

import com.google.gson.Gson;
import developer.marvel.com.dto.Result;
import developer.marvel.com.dto.Root;
import developer.marvel.com.service.IServiceMarvel;
import developer.marvel.com.util.Constantes;
import developer.marvel.com.util.ResponseMock;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 *
 * @author ND
 */
@Service
public class ServiceMarvelImpl implements IServiceMarvel {

    @Override
    public Root characters() {
        return new Gson().fromJson(ResponseMock.respose, Root.class);

    }

    @Override
    public Root charactersBy(Integer id) {
        Root fromJson = new Gson().fromJson(ResponseMock.respose, Root.class);
        List<Result> collect = fromJson.getData().getResults().stream().filter(row -> row.getId().equals(id)).collect(Collectors.toList());

        if (collect == null) {
            fromJson.setCode(Constantes.CODE_404);
            fromJson.getData().setResults(collect);
        } else {
            if (collect.isEmpty()) {
                fromJson.setCode(Constantes.CODE_404);
                fromJson.getData().setResults(collect);
            } else {
                fromJson.getData().setResults(collect);
            }
        }
        return fromJson;
    }

}
