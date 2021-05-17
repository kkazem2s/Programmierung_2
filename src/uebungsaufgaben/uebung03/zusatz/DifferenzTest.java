package uebungsaufgaben.uebung03.zusatz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DifferenzTest {
    @Test
    public void differenzTest() {
        Assertions.assertEquals(2640,Differenz.differenz(10));
    }
}
