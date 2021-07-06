package probeklausur_210705;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IterierbareArcheTest {
    private final IterierbareArche<Tier> arche = new IterierbareArche<>();

    @Test
    public void iterateTest() {
        arche.insert(new Hase("Hasi"));
        arche.insert(new Hase("Hasii"));
        arche.insert(new Hase("Hasiii"));

        int counter = 0;
        while (arche.iterator().hasNext()) {
            counter++;
            arche.remove();
        }
        Assertions.assertEquals(3, counter);
    }
}
/**
 * @author kkazem2s - 9031334
 */