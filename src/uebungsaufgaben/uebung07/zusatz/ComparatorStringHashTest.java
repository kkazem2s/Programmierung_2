package uebungsaufgaben.uebung07.zusatz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComparatorStringHashTest {
    private ComparatorStringHash comparatorStringHash;

    @BeforeEach
    public void setUp() {
        comparatorStringHash = new ComparatorStringHash();
    }

    @Test
    public void compareTest() {
        String s1 = "Hallo";
        String s2 = "World";
        String s3 = "HALLOMeineLieben";
        String s4 = "HalloWelt";

        System.out.println(s1.hashCode()); //  69490486
        System.out.println(s2.hashCode()); //  83766130
        System.out.println(s3.hashCode()); // -2124471979
        System.out.println(s4.hashCode()); //  524476716

        Assertions.assertEquals(-1, comparatorStringHash.compare(s1,s2));
        Assertions.assertEquals(1, comparatorStringHash.compare(s2,s3));
        Assertions.assertEquals(-1, comparatorStringHash.compare(s3,s4));
        Assertions.assertEquals(0, comparatorStringHash.compare(s4,s4));

    }
}
