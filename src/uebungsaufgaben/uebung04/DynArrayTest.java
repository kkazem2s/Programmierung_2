package uebungsaufgaben.uebung04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DynArrayTest {
    private DynArray<Integer> integerDynArray;
    private DynArray<String> stringDynArray;

    @BeforeEach
    public void setUp() {
        integerDynArray = new DynArray<>();
        stringDynArray = new DynArray<>();
    }

    @Test
    public void SizeTest() {
        Assertions.assertEquals(0,integerDynArray.size());
        Assertions.assertEquals(0,stringDynArray.size());
    }

    @Test
    public void addFirstTest() {
        integerDynArray.addFirst(1);
        stringDynArray.addFirst("Hello");
        Assertions.assertEquals(1, integerDynArray.size());
        Assertions.assertEquals(1, stringDynArray.size());
    }

    @Test
    public void addLastTest() {
        integerDynArray.addLast(1);
        stringDynArray.addLast("Hello");
        Assertions.assertEquals(1, integerDynArray.size());
        Assertions.assertEquals(1, stringDynArray.size());
    }

    @Test
    public void getTest() {
        integerDynArray.addFirst(1);
        stringDynArray.addFirst("Hello");
        integerDynArray.addLast(2);
        stringDynArray.addLast("World");

        Assertions.assertEquals(1, integerDynArray.get(1));
        Assertions.assertEquals("World", stringDynArray.get(2));
    }

    @Test
    public void setTest() {
        integerDynArray.addFirst(1);
        stringDynArray.addFirst("Hello");
        integerDynArray.addLast(2);
        stringDynArray.addLast("World");

        integerDynArray.set(1, 1337);
        stringDynArray.set(2, "User");

        Assertions.assertEquals(1337, integerDynArray.get(1));
        Assertions.assertEquals("User", stringDynArray.get(2));
    }

    @Test
    public void removeTest() {
        integerDynArray.addFirst(1);
        stringDynArray.addFirst("Hello");
        integerDynArray.addLast(2);
        stringDynArray.addLast("World");
        integerDynArray.addLast(3);
        stringDynArray.addLast("!");

        Assertions.assertEquals(3, integerDynArray.size());
        Assertions.assertEquals(3, stringDynArray.size());

        integerDynArray.removeFirst();
        stringDynArray.removeFirst();

        Assertions.assertEquals(2, integerDynArray.size());
        Assertions.assertEquals(2, stringDynArray.size());

        integerDynArray.removeLast();
        stringDynArray.removeLast();

        Assertions.assertEquals(1, integerDynArray.size());
        Assertions.assertEquals(1, stringDynArray.size());

        Assertions.assertEquals(2,integerDynArray.get(1));
        Assertions.assertEquals("World", stringDynArray.get(1));
    }

    @Test
    public void exceptionsTest() {
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> integerDynArray.removeFirst());
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> stringDynArray.removeLast());

        integerDynArray.addFirst(1);
        stringDynArray.addFirst("Hello");
        integerDynArray.addLast(2);
        stringDynArray.addLast("World");

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> integerDynArray.get(3));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> stringDynArray.get(-1));

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> integerDynArray.set(3, 3));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> stringDynArray.set(3, "!"));
    }

    @Test
    public void toStringTest() {
        integerDynArray.addFirst(1);
        stringDynArray.addFirst("Hello");
        integerDynArray.addLast(2);
        stringDynArray.addLast("World");
        integerDynArray.addLast(3);
        stringDynArray.addLast("!");

        Assertions.assertEquals("[1,2,3]", integerDynArray.toString());
        Assertions.assertEquals("[Hello,World,!]", stringDynArray.toString());
    }
}
