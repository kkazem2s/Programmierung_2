package uebungsaufgaben.uebung02.zusatz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VielfacheTest {

    @Test
    public void vielfacheTest() {
        // Example
        Assertions.assertEquals(23,Vielfache.vielfache(10));
        // Own Calculations
        Assertions.assertEquals(60,Vielfache.vielfache(16));
        Assertions.assertEquals(119,Vielfache.vielfache(23));
    }
}
