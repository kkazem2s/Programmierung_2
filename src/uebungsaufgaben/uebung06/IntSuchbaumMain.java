package uebungsaufgaben.uebung06;

public class IntSuchbaumMain {
    private static IntSuchbaum baum;

    public static void main(String [] args) {
        createBaum();

        System.out.println("Baum: " + baum.toString());

        baum.insert(20);
        System.out.println("insert(20): " + baum);

        baum.insert(7);
        System.out.println("insert(7): " + baum);

        baum.insert(41);
        System.out.println("insert(41): " + baum);

        baum.insert(1);
        System.out.println("insert(1): " + baum);

        baum.insert(43);
        System.out.println("insert(43): " + baum);

        baum.insert(49);
        System.out.println("insert(49): " + baum);

        System.out.println(baum.preorder());
        System.out.println(baum.inorder());

        System.out.println(baum.hoehe());


        /*
        Baum:
                        17
                       /  \
                      /    \
                     /      \
                    /        \
                   /          \
                  12          35
                 /  \        /  \
                /    \      /    \
               2     15    20    45
              / \               /  \
             /   \             /    \
            1     7           41    43
                                      \
                                       \
                                       49
         */
    }

    public static void createBaum() {
        IntSuchbaum two = new IntSuchbaum(2, null, null);
        IntSuchbaum fifteen = new IntSuchbaum(15, null, null);
        IntSuchbaum fourtyfive = new IntSuchbaum(45, null, null);
        IntSuchbaum twelve = new IntSuchbaum(12, two, fifteen);
        IntSuchbaum thirtyfive = new IntSuchbaum(35, null, fourtyfive);
        baum = new IntSuchbaum(17, twelve, thirtyfive);
    }
}
