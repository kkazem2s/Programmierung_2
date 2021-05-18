package uebungsaufgaben.uebung05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SchlangemitDynArrayTest {
    SchlangemitDynArray<Integer> queue;

    @BeforeEach
    public void setUp() {
        queue = new SchlangemitDynArray<>();
    }

    @Test
    public void createTest() {
        Assertions.assertNotNull(queue);
        Assertions.assertEquals(0, queue.size());
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
    public void sizeTest() {
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        Assertions.assertEquals(3, queue.size());
    }

    @Test
    public void firstTest() {
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        Assertions.assertEquals(1, queue.first());
    }

    @Test
    public void stringTest() {
        SchlangemitDynArray<String> stringQueue = new SchlangemitDynArray<>();

        Assertions.assertNotNull(stringQueue);
        Assertions.assertEquals(0, stringQueue.size());

        stringQueue.insert("Hello");
        stringQueue.insert("World");
        stringQueue.insert("!");

        Assertions.assertEquals(3, stringQueue.size());
        Assertions.assertEquals("Hello", stringQueue.first());

        Assertions.assertEquals("Hello", stringQueue.remove());
        Assertions.assertEquals("World", stringQueue.remove());
        Assertions.assertEquals("!", stringQueue.remove());
    }

    /*
        insert x
        remove x
        size
        first
        isEmpty x
     */

}

