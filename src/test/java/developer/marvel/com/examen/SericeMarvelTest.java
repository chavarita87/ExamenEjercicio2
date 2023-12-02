/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package developer.marvel.com.examen;

import com.google.gson.Gson;
import developer.marvel.com.dto.Root;
import developer.marvel.com.service.impl.ServiceMarvelImpl;
import developer.marvel.com.util.Constantes;
import developer.marvel.com.util.ResponseMock;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author ND
 */
@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class SericeMarvelTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private final ServiceMarvelImpl marvelService = new ServiceMarvelImpl();

    @Test
    public void test() {

        Root fromJson = new Gson().fromJson(ResponseMock.respose, Root.class);
        Mockito.when(restTemplate.getForEntity(Constantes.URL_1, Root.class))
                .thenReturn(new ResponseEntity(fromJson, HttpStatus.OK));
        Root characters = marvelService.characters();
        Assertions.assertEquals(fromJson, characters);
    }

    @Test
    public void test2() {

        Root fromJson = new Gson().fromJson(ResponseMock.respose, Root.class);
        Mockito.when(restTemplate.getForEntity(Constantes.URL_1, Root.class))
                .thenReturn(new ResponseEntity(fromJson, HttpStatus.OK));
        Root characters = marvelService.charactersBy(1009144);
        Assertions.assertEquals(fromJson, characters);
    }
}
