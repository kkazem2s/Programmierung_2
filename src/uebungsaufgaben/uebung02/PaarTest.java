package uebungsaufgaben.uebung02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaarTest {
    Paar<Integer,String> integerStringPaar;
    Paar<Integer,Integer> integerIntegerPaar;

    @BeforeEach
    public void setUp() {
        integerStringPaar = new Paar<>(1,"Aufgabe");
        integerIntegerPaar = new Paar<>(19,98);
    }

    @Test
    public void getTest() {
        Assertions.assertEquals(1, integerStringPaar.getErstes());
        Assertions.assertEquals("Aufgabe",integerStringPaar.getZweites());
    }

    @Test
    public void setTest() {
        integerIntegerPaar.setBeide(20,21);
        Assertions.assertEquals(20, integerIntegerPaar.getErstes());
        Assertions.assertEquals(21, integerIntegerPaar.getZweites());
    }

    @Test
    public void equalsTest() {
        Assertions.assertTrue(new Paar<>(1,"Aufgabe").equals(integerStringPaar));
    }

    @Test
    public void toStringTest() {
        Assertions.assertEquals("(1,Aufgabe)", integerStringPaar.toString());
    }

}
