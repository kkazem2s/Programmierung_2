package uebungsaufgaben.uebung01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import uebungsaufgaben.uebung00.Lifo;

public class LifoTest {
    public static Lifo<Integer> lifo;
    public static Lifo<Integer> lifoNegative;
    public static Lifo<String> lifoString;

    @BeforeEach
    public void createFifo() {
        lifo = new Lifo<>(5);
    }
    @Test
    @Order(1)
    public void sizeTest() {
        Assertions.assertEquals(5,lifo.capacity());
    }
    @Test
    @Order(2)
    public void pushTest() {
        lifo.push(1);
        Assertions.assertEquals(1,lifo.size());
        lifo.push(2);
        Assertions.assertEquals(2,lifo.size());
        lifo.push(3);
        Assertions.assertEquals(3,lifo.size());
    }
    @Test
    @Order(3)
    public void popTest() {
        pushTest();
        Assertions.assertEquals(3,lifo.pop());
        Assertions.assertEquals(2,lifo.pop());
        Assertions.assertEquals(1,lifo.pop());
    }

    @Test
    @Order(4)
    public void errorTest() {
        lifo.push(1);
        lifo.push(2);
        lifo.push(3);
        lifo.push(4);
        lifo.push(5);
        Assertions.assertThrows(IndexOutOfBoundsException.class , () -> lifo.push(6));
    }

    @Test
    @Order(5)
    public void negativeTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> lifoNegative = new Lifo<>(-1));
    }

    @Test
    @Order(6)
    public void stringTest() {
        lifoString = new Lifo<>(5);
        lifoString.push("Hello");
        lifoString.push("World");
        Assertions.assertEquals(2,lifoString.size());
        Assertions.assertEquals("World",lifoString.pop());
    }
}
