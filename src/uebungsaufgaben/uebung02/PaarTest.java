package uebungsaufgaben.uebung02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class PaarTest {
    Paar<Integer,String> integerStringPaar;
    Paar<Integer,Integer> integerIntegerPaar;

    @BeforeEach
    public void setUp() {
        integerStringPaar = new Paar<>(1,"Aufgabe");
        integerIntegerPaar = new Paar<>(19,98);
    }

    @Order(1)
    @Test
    public void getTest() {
        Assertions.assertEquals(integerStringPaar.getErstes(), 1);
        Assertions.assertEquals(integerStringPaar.getZweites(), "Aufgabe");
    }

    @Order(2)
    @Test
    public void setTest() {
        integerIntegerPaar.setBeide(20,21);
        Assertions.assertEquals(integerIntegerPaar.getErstes(), 20);
        Assertions.assertEquals(integerIntegerPaar.getZweites(), 21);
    }

    @Order(3)
    @Test
    public void equalsTest() {
        Assertions.assertTrue(new Paar<>(1,"Aufgabe").equals(integerStringPaar));
    }

    @Order(4)
    @Test
    public void toStringTest() {
        Assertions.assertEquals("(1,Aufgabe)", integerStringPaar.toString());
    }
}
