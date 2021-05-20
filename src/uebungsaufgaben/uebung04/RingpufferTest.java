package uebungsaufgaben.uebung04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RingpufferTest {
    private Ringpuffer<Integer> integerRingpuffer;
    private Ringpuffer<String> stringRingpuffer;

    @BeforeEach
    public void setUp() {
        integerRingpuffer = new Ringpuffer<>(5);
        stringRingpuffer = new Ringpuffer<>(3);
    }

    @Test
    public void createTest() {
        Assertions.assertEquals(0, integerRingpuffer.size());
        Assertions.assertNotNull(integerRingpuffer);
    }

    @Test
    public void createExceptionTest() {
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> new Ringpuffer<>(-1));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> new Ringpuffer<>(0));
    }

    @Test
    public void addFirstLastGetTest() {
        Assertions.assertEquals(0,integerRingpuffer.size());

        integerRingpuffer.addFirst(1);
        integerRingpuffer.addLast(2);

        Assertions.assertEquals(2,integerRingpuffer.size());
        Assertions.assertEquals(1, integerRingpuffer.get(0));
        Assertions.assertEquals(2, integerRingpuffer.get(0));
    }

    @Test
    public void addExceptionTest() {
        integerRingpuffer.addFirst(5);
        integerRingpuffer.addFirst(4);
        integerRingpuffer.addFirst(3);
        integerRingpuffer.addFirst(2);
        integerRingpuffer.addFirst(1);

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> integerRingpuffer.addFirst(0));
    }
    @Test
    public void setTest() {
        Assertions.assertEquals(0,integerRingpuffer.size());

        integerRingpuffer.addFirst(1);
        integerRingpuffer.addLast(2);
        integerRingpuffer.set(0,10);
        integerRingpuffer.set(1,20);

        Assertions.assertEquals(10, integerRingpuffer.get(0));
        Assertions.assertEquals(20, integerRingpuffer.get(0));
    }
    @Test
    public void removeTest() {
        integerRingpuffer.addFirst(3);
        integerRingpuffer.addFirst(2);
        integerRingpuffer.addFirst(1);

        Assertions.assertEquals(3,integerRingpuffer.size());

        integerRingpuffer.removeFirst();
        integerRingpuffer.removeLast();

        Assertions.assertEquals(1,integerRingpuffer.size());
        Assertions.assertEquals(2, integerRingpuffer.get(0));

    }
    @Test
    public void removeExceptionTest() {
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> integerRingpuffer.removeFirst());
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> integerRingpuffer.removeLast());
    }

    @Test
    public void toStringTest() {
        integerRingpuffer.addFirst(3);
        integerRingpuffer.addFirst(2);
        integerRingpuffer.addFirst(1);

        Assertions.assertEquals("[1,2,3]", integerRingpuffer.toString());
        Assertions.assertEquals("[ ]", stringRingpuffer.toString());
    }

    @Test
    public void stringTest() {
        Assertions.assertEquals("[ ]", stringRingpuffer.toString());

        stringRingpuffer.addFirst("Hello");
        stringRingpuffer.addLast("World");
        stringRingpuffer.addLast("!");

        Assertions.assertEquals(3, stringRingpuffer.size());
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> stringRingpuffer.addLast(""));

        stringRingpuffer.removeFirst();

        Assertions.assertEquals(2, stringRingpuffer.size());

        Assertions.assertEquals("World", stringRingpuffer.get(0));

        stringRingpuffer.set(0, "Hello");

        Assertions.assertEquals("Hello", stringRingpuffer.get(0));
    }
}
