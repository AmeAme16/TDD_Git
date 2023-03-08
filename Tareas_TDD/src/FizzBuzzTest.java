import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void pruebaN1() {
        FizzBuzz prueba= new FizzBuzz();
        prueba.Prueba(1);
        System.out.println(prueba.Prueba(1));
        assertEquals("1",prueba.Prueba(1));
    }
    @Test
    void pruebaN2() {
        FizzBuzz prueba= new FizzBuzz();
        prueba.Prueba(2);
        System.out.println(prueba.Prueba(2));
        assertEquals("2",prueba.Prueba(2));
    }
    @Test
    void pruebaN3() {
        FizzBuzz prueba= new FizzBuzz();
        prueba.Prueba(3);
        System.out.println(prueba.Prueba(3));
        assertEquals("Fizz",prueba.Prueba(3));
    }
    @Test
    void pruebaN4() {
        FizzBuzz prueba= new FizzBuzz();
        prueba.Prueba(4);
        System.out.println(prueba.Prueba(4));
        assertEquals("4",prueba.Prueba(4));
    }
    @Test
    void pruebaN5() {
        FizzBuzz prueba= new FizzBuzz();
        prueba.Prueba(5);
        System.out.println(prueba.Prueba(5));
        assertEquals("Buzz",prueba.Prueba(5));
    }
    @Test
    void pruebaN6() {
        FizzBuzz prueba= new FizzBuzz();
        prueba.Prueba(6);
        System.out.println(prueba.Prueba(6));
        assertEquals("Fizz",prueba.Prueba(6));
    }
}