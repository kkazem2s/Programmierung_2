package uebungsaufgaben.uebung03.zusatz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static uebungsaufgaben.uebung03.zusatz.Josephus.loese;

public class JosephusTest {
    @Test
    public void loeseTest() {
        // Known solutions to the problem
        Assertions.assertEquals(31, loese(41,3));
        Assertions.assertEquals(2,loese(5,2));
    }
}
