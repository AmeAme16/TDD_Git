import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {

    @Test
    void sumaVacio() {
        OperacionesTDD prueba= new OperacionesTDD();
        prueba.suma("");
        System.out.println(prueba.suma(""));
        assertEquals("0",prueba.suma(""));

    }

    @Test
    void sumaN1() {
        OperacionesTDD prueba= new OperacionesTDD();
        prueba.suma("1");
        System.out.println(prueba.suma("1"));
        assertEquals("1",prueba.suma("1"));

    }
}