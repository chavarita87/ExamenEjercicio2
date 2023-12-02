/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package developer.marvel.com.controller;

import developer.marvel.com.dto.LlamadaServicioDTO;
import developer.marvel.com.service.IQueryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ND
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class NumConsultasController {
    
    @Autowired
    private IQueryService service;
    
    
     @GetMapping("/getAllQueryService")
    public ResponseEntity<List<LlamadaServicioDTO>> getAllQueryService() {

        return new ResponseEntity<>(service.getAllQueryService(), HttpStatus.OK);
    }
    
}
