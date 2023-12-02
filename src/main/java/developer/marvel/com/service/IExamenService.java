/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package developer.marvel.com.service;

import developer.marvel.com.dto.Root;

/**
 *
 * @author ND
 */
public interface IExamenService {
    
    public Root getCharacters();
    public Root getCharactersBy(Integer id);
}
