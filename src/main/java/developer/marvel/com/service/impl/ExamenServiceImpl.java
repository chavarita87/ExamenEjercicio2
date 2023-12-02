/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package developer.marvel.com.service.impl;

import developer.marvel.com.cliente.ClienteEjercicio1;
import developer.marvel.com.dto.Root;
import developer.marvel.com.model.LlamadaServicio;
import developer.marvel.com.repository.LlamadaServicioRepository;
import developer.marvel.com.service.IExamenService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ND
 */
@Service
public class ExamenServiceImpl implements IExamenService {

    @Autowired
    private ClienteEjercicio1 clienteEjercicio;
    @Autowired
    private LlamadaServicioRepository repository;

    @Override
    public Root getCharacters() {
        LlamadaServicio ls = new LlamadaServicio();
        ls.setServicio("/v1/public/characters");
        ls.setFecha( new Date());
        repository.save(ls);
        return clienteEjercicio.invoca().getBody();

    }

    @Override
    public Root getCharactersBy(Integer id) {
        LlamadaServicio ls = new LlamadaServicio();
        ls.setServicio("/v1/public/characters/{characterId}");
        ls.setFecha( new Date());
        repository.save(ls);
        return clienteEjercicio.invoca(id).getBody();
    }

}
