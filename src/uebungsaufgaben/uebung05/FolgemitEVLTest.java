package uebungsaufgaben.uebung05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class FolgemitEVLTest {
    private FolgemitEVL<Integer> evl;

    @BeforeEach
    public void setUp() {
        evl = new FolgemitEVL<>();
    }

    @Test
    public void createTest() {
        Assertions.assertNotNull(evl);
    }

    @Test
    public void sizeTest() {
        Assertions.assertEquals(0, evl.size());
    }

    @Test
    public void isEmptyTest() {
        Assertions.assertTrue(evl.isEmpty());
        evl.set(10,1);
        Assertions.assertFalse(evl.isEmpty());
    }

    @Test
    public void setTest() {
        Assertions.assertThrows(NoSuchElementException.class, () -> evl.set(-1, 10));
        evl.set(11,42);
        evl.set(1, 43);
        evl.set(0, 41);
        Assertions.assertEquals(3, evl.size());
        Assertions.assertEquals("[41,42,43]", evl.toString());
    }
}
