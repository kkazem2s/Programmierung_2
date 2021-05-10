package uebungsaufgaben.uebung01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uebungsaufgaben.uebung00.Fifo;
import uebungsaufgaben.uebung00.Helper;
import uebungsaufgaben.uebung00.Lifo;

public class HelperTest {
    public static Fifo<Integer> fifo;
    public static Lifo<Integer> lifo;
    public static Helper helper;

    @BeforeEach
    public void createADT() {
        fifo = new Fifo<>(5);
        lifo = new Lifo<>(5);
        helper = new Helper();
    }

    @Test
    public static void fifoToLifoTest() {
        fifo.push(1);
        fifo.push(2);
        fifo.push(3);
        fifo.push(4);
        fifo.push(5);
        helper.move(fifo,lifo);

        Assertions.assertEquals(5,lifo.pop());
        Assertions.assertEquals(4,lifo.pop());
        Assertions.assertEquals(3,lifo.pop());
        Assertions.assertEquals(2,lifo.pop());
        Assertions.assertEquals(1,lifo.pop());
    }

    @Test
    public void lifoToFifoTest() {
        lifo.push(1);
        lifo.push(2);
        lifo.push(3);
        lifo.push(4);
        lifo.push(5);
        helper.move(lifo,fifo);

        Assertions.assertEquals(5,fifo.pop());
        Assertions.assertEquals(4,fifo.pop());
        Assertions.assertEquals(3,fifo.pop());
        Assertions.assertEquals(2,fifo.pop());
        Assertions.assertEquals(1,fifo.pop());
    }
}
