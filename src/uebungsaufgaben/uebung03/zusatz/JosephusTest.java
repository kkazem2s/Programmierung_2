package uebungsaufgaben.uebung03.zusatz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static uebungsaufgaben.uebung03.zusatz.Josephus.loese;

public class JosephusTest {
    @Test
    public void loeseTest() {
        // Known solutions to the problem
        Assertions.assertEquals(loese(41,3),31);
        Assertions.assertEquals(loese(5,2),2);
    }
}
