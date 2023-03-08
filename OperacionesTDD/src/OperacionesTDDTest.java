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

    @Test
    void sumaN1yN2() {
        OperacionesTDD prueba= new OperacionesTDD();
        prueba.suma("1,2");
        System.out.println(prueba.suma("1,2"));
        assertEquals("3",prueba.suma("1,2"));

    }
    @Test
    void sumaN1yN1yN2() {
        OperacionesTDD prueba= new OperacionesTDD();
        prueba.suma("1,1,2");
        System.out.println(prueba.suma("1,1,2"));
        assertEquals("4",prueba.suma("1,1,2"));

    }
    @Test
    void VacioDespuesDeComa() {
        OperacionesTDD prueba= new OperacionesTDD();
        prueba.suma("1,2,");
        System.out.println(prueba.suma("1,2,"));
        assertEquals("-1",prueba.suma("1,2,"));

    }
}