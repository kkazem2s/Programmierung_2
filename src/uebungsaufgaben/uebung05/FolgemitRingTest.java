package uebungsaufgaben.uebung05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class FolgemitRingTest {
    private FolgemitRing<Integer> folge;

    @BeforeEach
    public void setUp() {
        folge = new FolgemitRing<>(5);
    }

    @Test
    public void createTest() {
        Assertions.assertNotNull(folge);
    }

    @Test
    public void sizeTest() {
        Assertions.assertEquals(0,folge.size());
        folge.set(1,1);
        Assertions.assertEquals(1, folge.size());
    }

    @Test
    public void isEmptyTest() {
        Assertions.assertTrue(folge.isEmpty());
        folge.set(1,1);
        Assertions.assertFalse(folge.isEmpty());
        folge.get(1);
        Assertions.assertTrue(folge.isEmpty());
    }

    @Test
    public void addAndGetTest() {
        folge.set(0,1);
        System.out.println(folge);
        folge.set(2,2);
        folge.set(3,3);
        folge.set(4,4);
        System.out.println(folge);
        Assertions.assertEquals(3, folge.get(2));
        Assertions.assertEquals(1, folge.get(0));
        System.out.println(folge);
    }

    @Test
    public void exceptionTest() {
        Assertions.assertThrows(UnsupportedOperationException.class, () -> folge.insert(1));
        Assertions.assertThrows(UnsupportedOperationException.class, () -> folge.remove());
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> new FolgemitRing<Integer>(-2));
        Assertions.assertThrows(NoSuchElementException.class, () -> folge.get(42));
        Assertions.assertThrows(NoSuchElementException.class, () -> folge.set(-1, 42));

    }
}
