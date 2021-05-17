package uebungsaufgaben.uebung03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static uebungsaufgaben.uebung03.Josephus.loese;

public class JosephusTest {
    @Test
    public void loeseTest() {
        // Known solutions to the problem
        Assertions.assertEquals(3,loese(5,2));
        Assertions.assertEquals(5,loese(6,2));
        Assertions.assertEquals(1,loese(6,3));
        Assertions.assertEquals(3,loese(8,5));
        Assertions.assertEquals(31, loese(41,3));
    }
}
