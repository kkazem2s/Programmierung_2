package uebungsaufgaben.uebung01;

import org.junit.jupiter.api.*;
import uebungsaufgaben.uebung00.Fifo;
import uebungsaufgaben.uebung00.Lifo;

public class FifoTest {
    public static Fifo<Integer> fifo;
    public static Fifo<Integer> fifonegative;
    public static Lifo<String> fifostring;

    @BeforeEach
    public void createFifo() {
        fifo = new Fifo<>(5);
    }
    @Test
    @Order(1)
    public void sizeTest() {
        Assertions.assertEquals(5,fifo.size());
    }
    @Test
    @Order(2)
    public void pushTest() {
        fifo.push(1);
        Assertions.assertEquals(1,fifo.capacity());
        fifo.push(2);
        Assertions.assertEquals(2,fifo.capacity());
        fifo.push(3);
        Assertions.assertEquals(3,fifo.capacity());
    }

    @Test
    @Order(3)
    public void popTest() {
        pushTest();
        Assertions.assertEquals(1,fifo.pop());
        Assertions.assertEquals(2,fifo.pop());
        Assertions.assertEquals(3,fifo.pop());
    }

    @Test
    @Order(4)
    public void errorTest() {
        fifo.push(1);
        fifo.push(2);
        fifo.push(3);
        fifo.push(4);
        fifo.push(5);
        Assertions.assertThrows(IndexOutOfBoundsException.class , () -> fifo.push(6));
    }

    @Test
    @Order(5)
    public void negativeTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> fifonegative = new Fifo<>(-1));
    }

    @Test
    @Order(6)
    public void stringTest() {
        fifostring = new Lifo<>(5);
        fifostring.push("Hello");
        fifostring.push("World");
        Assertions.assertEquals(2,fifostring.capacity());
        Assertions.assertEquals("World",fifostring.pop());
    }
}
