package developer.marvel.com.examen;

import developer.marvel.com.cliente.ClienteEjercicio1;
import developer.marvel.com.dto.Root;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class ExamenApplicationTests {

    @Test
    void test() {
        ClienteEjercicio1 ejercicio1 = new ClienteEjercicio1();
        ResponseEntity<Root> invoca = ejercicio1.invoca();
        System.out.println("respuesta " + invoca.getBody().getCode());
        Assertions.assertEquals(invoca.getStatusCode(), HttpStatus.OK);
    }

    @Test
    void test2() {
        ClienteEjercicio1 ejercicio1 = new ClienteEjercicio1();
        ResponseEntity<Root> invoca = ejercicio1.invoca(1009144);
        System.out.println("respuesta " + invoca.getBody().getCode());
        Assertions.assertEquals(invoca.getStatusCode(), HttpStatus.OK);
    }
}
