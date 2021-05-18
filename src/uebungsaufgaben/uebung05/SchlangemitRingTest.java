package uebungsaufgaben.uebung05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SchlangemitRingTest {
    SchlangemitRing<Integer> queue;

    @BeforeEach
    public void setUp() {
        queue = new SchlangemitRing<>(5);
    }

    @Test
    public void createTest() {
        Assertions.assertNotNull(queue);
    }

    @Test
    public void createExceptionTest() {
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> new SchlangemitRing<Integer>(0));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> new SchlangemitRing<Integer>(-1));
    }

    @Test
    public void isEmptyTest() {
        Assertions.assertTrue(queue.isEmpty());
        queue.insert(1);
        Assertions.assertFalse(queue.isEmpty());
    }

    @Test
    public void insertRemoveTest() {
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        Assertions.assertEquals(1, queue.remove());
        Assertions.assertEquals(2, queue.remove());
        Assertions.assertEquals(3, queue.remove());
    }

    @Test
    public void insertExceptionTest() {
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> queue.insert(6));
    }

    @Test
    public void removeExceptionTest() {
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> queue.remove());
    }

    @Test
    public void firstTest() {
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> queue.first());

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        Assertions.assertEquals(1, queue.first());
        Assertions.assertEquals(1, queue.remove());
        Assertions.assertEquals(2, queue.first());
    }

    @Test
    public void stringTest() {
        SchlangemitRing<String> stringQueue = new SchlangemitRing<>(3);

        Assertions.assertTrue(stringQueue.isEmpty());
        Assertions.assertThrows(IndexOutOfBoundsException.class, stringQueue::remove);

        stringQueue.insert("Hello");
        Assertions.assertFalse(stringQueue.isEmpty());

        stringQueue.insert("World");
        stringQueue.insert("!");
        Assertions.assertEquals(3, stringQueue.size());

        Assertions.assertEquals("Hello", stringQueue.remove());
        Assertions.assertEquals("World", stringQueue.remove());
        Assertions.assertEquals("!", stringQueue.remove());
    }

}
