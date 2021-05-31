package uebungsaufgaben.uebung06;

public class BinearbaumMain {
    public static void main(String [] args) {
        Binaerbaum<Integer> b1 = new Binaerbaum<>(5, null, null);
        Binaerbaum<Integer> b2 = new Binaerbaum<>(15, null, null);
        Binaerbaum<Integer> b3 = new Binaerbaum<>(10, b1, b2);

        Binaerbaum<Integer> r1 = new Binaerbaum<>(25, null, null);
        Binaerbaum<Integer> r2 = new Binaerbaum<>(35, null, null);
        Binaerbaum<Integer> r3 = new Binaerbaum<>(30, r1, r2);

        Binaerbaum<Integer> w = new Binaerbaum<>(20, b3, r3);


        System.out.println(w.isEmpty());
        System.out.println(w.hoehe());
        System.out.println(w.size());
        System.out.println(w);

        System.out.println("PreOrder: " + w.preorder());
        System.out.println("InOrder: " + w.inorder());
        System.out.println("PostOrder: " + w.postorder());

        /*                20
                        /    \
                       /      \
                      10      30
                     /  \    /  \
                    5   15  25  35        */
    }
}
