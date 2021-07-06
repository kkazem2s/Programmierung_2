package uebungsaufgaben.uebung06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaerbaumTest {
    private final Binaerbaum<Boolean> emptyBaum = new Binaerbaum<>();
    private Binaerbaum<Integer> baum;

    @BeforeEach
    public void setUp() {
        Binaerbaum<Integer> four = new Binaerbaum<>(4, null, null);
        Binaerbaum<Integer> five = new Binaerbaum<>(5, null, null);
        Binaerbaum<Integer> two = new Binaerbaum<>(2, four, five);
        Binaerbaum<Integer> six = new Binaerbaum<>(6, null, null);
        Binaerbaum<Integer> seven = new Binaerbaum<>(7, null, null);
        Binaerbaum<Integer> three = new Binaerbaum<>(3, six, seven);
        this.baum = new Binaerbaum<>(1, two, three);
    }

    @Test
    public void createTest() {
        Assertions.assertNotNull(emptyBaum);
        Assertions.assertNotNull(baum);
    }

    @Test
    public void isEmptyTest() {
        Assertions.assertTrue(emptyBaum.isEmpty());
        Assertions.assertFalse(baum.isEmpty());
    }

    @Test
    public void hoeheTest() {
        Assertions.assertEquals(0, emptyBaum.hoehe());
        Assertions.assertEquals(3, baum.hoehe());
    }

    @Test
    public void toStringTest() {
        Assertions.assertEquals("<<<><4><>><2><<><5><>>><1><<<><6><>><3><<><7><>>>", baum.toString());
    }

    @Test
    public void sizeTest() {
        Assertions.assertEquals(7, baum.size());
    }

    @Test
    public void preorderTest() {
        Assertions.assertEquals("1 2 4 5 3 6 7 ", baum.preorder());
    }

    @Test
    public void inorderTest() {
        Assertions.assertEquals("4 2 5 1 6 3 7 ", baum.inorder());
    }

    @Test
    public void postorderTest() {
        Assertions.assertEquals("4 5 2 6 7 3 1 ", baum.postorder());
    }
}
