package uebungsaufgaben.uebung04.zusatz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static uebungsaufgaben.uebung04.zusatz.Teilbar.teilbar;

public class TeilbarTest {

    @Test
    public void teilbarTest() {
        Assertions.assertEquals(2520,teilbar(10));
        Assertions.assertEquals(232792560,teilbar(20));
    }
}
