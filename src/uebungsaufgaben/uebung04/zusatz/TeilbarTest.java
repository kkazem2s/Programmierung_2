package uebungsaufgaben.uebung04.zusatz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static uebungsaufgaben.uebung04.zusatz.Teilbar.teilbar;

public class TeilbarTest {

    @Test
    public void teilbarTest() {
        Assertions.assertEquals(teilbar(10),2520);
        Assertions.assertEquals(teilbar(20),232792560);
    }
}
