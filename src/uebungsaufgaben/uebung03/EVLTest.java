package uebungsaufgaben.uebung03;

import org.junit.jupiter.api.*;

public class EVLTest {
    public EVL<Integer> integerEVL;
    public EVL<Integer> integerEVL2 = new EVL<>();

    @BeforeEach
    public void setUp() {
        integerEVL = new EVL<>();
    }
    @Test
    public void removeNodeOnEmptyListTest() {
        Assertions.assertNull(integerEVL.removeFirst());
    }

    @Test
    public void addFirstAndSize() {
        integerEVL.addFirst(1);
        Assertions.assertEquals(1, integerEVL.size());
    }

    @Test
    public void addLastTest() {
        integerEVL.addFirst(1);
        integerEVL.addLast(2);
        Assertions.assertEquals(2, integerEVL.size());
    }

    @Test
    public void addPositionAndToStringTest() {
        integerEVL.addFirst(1);
        integerEVL.addLast(2);
        integerEVL.add(1,20);
        Assertions.assertEquals("[1,20,2]", integerEVL.toString());
    }

    @Test
    public void addNewFirstPosition() {
        integerEVL.addFirst(2);
        integerEVL.addFirst(1);
        integerEVL.addLast(3);
        integerEVL.addLast(4);
        Assertions.assertEquals("[1,2,3,4]",integerEVL.toString());
    }
    @Test
    public void deleteTest() {
        integerEVL.addFirst(2);
        integerEVL.addFirst(1);
        integerEVL.addLast(3);
        integerEVL.addLast(4);
        integerEVL.removeFirst();
        integerEVL.removeLast();
        Assertions.assertEquals("[2,3]",integerEVL.toString());
    }
    @Test
    public void zipTest() {
        integerEVL.addFirst(5);
        integerEVL.addFirst(3);
        integerEVL.addFirst(1);
        integerEVL2.addFirst(6);
        integerEVL2.addFirst(4);
        integerEVL2.addFirst(2);
        EVL<Integer> compare = new EVL<>();
        compare.addFirst(6);
        compare.addFirst(5);
        compare.addFirst(4);
        compare.addFirst(3);
        compare.addFirst(2);
        compare.addFirst(1);
        Assertions.assertEquals(compare.toString(), integerEVL.zip(integerEVL2).toString());
    }
}
