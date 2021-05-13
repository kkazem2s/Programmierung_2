package uebungsaufgaben.uebung03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FifomitEVLTest {
    private FifomitEVL<Integer> fifo;

    @BeforeEach
    public void setUp() {
        fifo = new FifomitEVL<>();
    }

    @Test
    public void isEmptyTest() {
        Assertions.assertTrue(fifo.isEmpty());
    }
    @Test
    public void pushTest() {
        fifo.push(1);
        Assertions.assertEquals(1,fifo.size());
    }
    @Test
    public void popTest() {
        Assertions.assertNull(fifo.pop());
        fifo.push(1);
        Assertions.assertEquals(1,fifo.pop());
    }
    @Test
    public void peekTest() {
        fifo.push(1);
        fifo.push(2);
        fifo.push(3);
        Assertions.assertEquals(1,fifo.peek());
    }
    @Test
    public void stringTest() {
        FifomitEVL<String> stringFifomitEVL = new FifomitEVL<>();
        Assertions.assertTrue(stringFifomitEVL.isEmpty());
        stringFifomitEVL.push("Hello");
        stringFifomitEVL.push("World");
        Assertions.assertEquals(2,stringFifomitEVL.size());
        Assertions.assertEquals("Hello",stringFifomitEVL.peek());
        Assertions.assertEquals("Hello",stringFifomitEVL.pop());
        Assertions.assertEquals("World",stringFifomitEVL.pop());
    }
}
