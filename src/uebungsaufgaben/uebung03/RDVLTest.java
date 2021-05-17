package uebungsaufgaben.uebung03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RDVLTest {
    private RDVL<Integer> rdvl;

    @BeforeEach
    public void setUp() {
        rdvl = new RDVL<>();
    }
    @Test
    public void createTest() {
        Assertions.assertNotNull(rdvl);
        Assertions.assertEquals(0, rdvl.size());
        Assertions.assertTrue(rdvl.isEmpty());
    }
    @Test
    public void addTest() {
        rdvl.add(1);
        Assertions.assertEquals(1,rdvl.element());
        rdvl.add(2);
        Assertions.assertEquals(2,rdvl.element());
        Assertions.assertEquals(2, rdvl.size());
    }
    @Test
    public void removeTest() {
        rdvl.add(1);
        rdvl.add(2);
        rdvl.add(3);
        /*
            <- 3 - 2 - 1 ->
               ^
         */
        Assertions.assertEquals(3,rdvl.size());
        rdvl.remove();
        // Where should Pointer go? Assumed: next element
        Assertions.assertEquals(2,rdvl.element());
    }
    @Test
    public void movePointerTest() {
        rdvl.add(1);
        rdvl.add(2);
        rdvl.add(3);
        rdvl.add(4);
        rdvl.add(5);
        /*
            <- 5 - 4 - 3 - 2 - 1 ->
               ^
         */
        Assertions.assertEquals(5,rdvl.element());
        rdvl.next(2);
        /*
            <- 5 - 4 - 3 - 2 - 1 ->
                       ^
         */
        Assertions.assertEquals(3,rdvl.element());
        rdvl.prev(4);
        /*
            <- 5 - 4 - 3 - 2 - 1 ->
                           ^
         */
        Assertions.assertEquals(2,rdvl.element());
    }
}
