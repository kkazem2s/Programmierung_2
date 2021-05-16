package uebungsaufgaben.uebung04;

import org.junit.jupiter.api.Test;

public class DynArrayTest {

    @Test
    public void createDynArray() {
        DynArray<Integer> dynArray = new DynArray<>();

        dynArray.addFirst(1);
        System.out.println(dynArray);
        dynArray.addFirst(2);
        System.out.println(dynArray);
        dynArray.addLast(3);
        System.out.println(dynArray);
    }
}
