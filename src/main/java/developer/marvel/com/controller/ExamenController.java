/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package developer.marvel.com.controller;


import developer.marvel.com.dto.Result;
import developer.marvel.com.service.IExamenService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ND
 */
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = {"Authorization", "Origin"})
@RestController
@RequestMapping("/api")
public class ExamenController {

    @Autowired
    private IExamenService service;

    @GetMapping("/wrapper/ejercicio1")
    public ResponseEntity<List<Result>> getAllCharacters() {

        return new ResponseEntity<>(service.getCharacters().getData().getResults(), HttpStatus.OK);
    }
    
    @GetMapping("/wrapper/ejercicio2")
    public ResponseEntity<List<Result>> getCharactersBy(@RequestParam(name = "id", required = true) Integer id) {

        return new ResponseEntity<>(service.getCharactersBy(id).getData().getResults(), HttpStatus.OK);
    }
}
