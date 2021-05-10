package uebungsaufgaben.uebung01;

import org.junit.jupiter.api.*;
import uebungsaufgaben.uebung00.Fifo;
import uebungsaufgaben.uebung00.Lifo;

public class FifoTest {
    public static Fifo<Integer> fifo;
    public static Fifo<Integer> fifoNegative;
    public static Lifo<String> fifoString;

    @BeforeEach
    public void createFifo() {
        fifo = new Fifo<>(5);
    }
    @Test
    @Order(1)
    public void sizeTest() {
        Assertions.assertEquals(5,fifo.capacity());
    }
    @Test
    @Order(2)
    public void pushTest() {
        fifo.push(1);
        Assertions.assertEquals(1,fifo.size());
        fifo.push(2);
        Assertions.assertEquals(2,fifo.size());
        fifo.push(3);
        Assertions.assertEquals(3,fifo.size());
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
        Assertions.assertThrows(IllegalArgumentException.class, () -> fifoNegative = new Fifo<>(-1));
    }

    @Test
    @Order(6)
    public void stringTest() {
        fifoString = new Lifo<>(5);
        fifoString.push("Hello");
        fifoString.push("World");
        Assertions.assertEquals(2,fifoString.size());
        Assertions.assertEquals("World",fifoString.pop());
    }
}
