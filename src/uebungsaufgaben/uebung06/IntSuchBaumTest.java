package uebungsaufgaben.uebung06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class IntSuchBaumTest {
    private final IntSuchbaum emptyBaum = new IntSuchbaum();
    private IntSuchbaum baum;

    @BeforeEach
    public void setUp() {
        IntSuchbaum one = new IntSuchbaum(1, null, null);
        IntSuchbaum three = new IntSuchbaum(3, null, null);

        IntSuchbaum five = new IntSuchbaum(5, null, null);
        IntSuchbaum seven = new IntSuchbaum(7, null, null);


        IntSuchbaum two = new IntSuchbaum(2, one, three);
        IntSuchbaum six = new IntSuchbaum(6, five, seven);

        this.baum = new IntSuchbaum(4, two, six);
    }

    @Test
    public void createTest() {
        Assertions.assertNotNull(emptyBaum);
        Assertions.assertNotNull(baum);
    }

    @Test
    public void containsTest() {
        System.out.println(baum);
        Assertions.assertTrue(baum.contains(2));
        Assertions.assertTrue(baum.contains(5));
        Assertions.assertFalse(baum.contains(42));
    }

    @Test
    public void removeTest() {
        System.out.println(baum);
        Assertions.assertEquals(7, baum.size());
        baum.remove(5);
        Assertions.assertEquals(6, baum.size());
        Assertions.assertThrows(NoSuchElementException.class, () -> baum.remove(42));
        Assertions.assertEquals(6, baum.size());
    }
}
