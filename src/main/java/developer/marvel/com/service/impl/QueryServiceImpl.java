/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package developer.marvel.com.service.impl;

import developer.marvel.com.dto.LlamadaServicioDTO;
import developer.marvel.com.model.LlamadaServicio;
import developer.marvel.com.repository.LlamadaServicioRepository;
import developer.marvel.com.service.IQueryService;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ND
 */
@Service
public class QueryServiceImpl implements IQueryService {

    @Autowired
    private LlamadaServicioRepository repository;

    @Override
    public List<LlamadaServicioDTO> getAllQueryService() {
        List<LlamadaServicioDTO> dTOs = new ArrayList<>();
        List<LlamadaServicio> findAll = repository.findAll();
        for (LlamadaServicio llamadaServicio : findAll) {
            dTOs.add(convertToDto(llamadaServicio));
        }
        return dTOs;
    }

    private LlamadaServicioDTO convertToDto(LlamadaServicio ls) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(ls, LlamadaServicioDTO.class);
    }

}
