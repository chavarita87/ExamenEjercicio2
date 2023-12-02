/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package developer.marvel.com.service;

import developer.marvel.com.dto.Root;

/**
 *
 * @author ND
 */
public interface IServiceMarvel {

    public Root characters();

    public Root charactersBy(Integer id);
}
