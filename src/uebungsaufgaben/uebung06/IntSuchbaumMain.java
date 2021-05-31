package uebungsaufgaben.uebung06;

public class IntSuchbaumMain {
    public static void main(String [] args) {
        IntSuchbaum b = new IntSuchbaum(5, null, null);

        System.out.println(b);

        b.insert(3);
        b.insert(7);
        b.insert(1);
        b.insert(4);
        b.insert(6);
        b.insert(8);

        System.out.println("Baum: " + b);

        b.remove(8);
        System.out.println("Entferne 8: " + b);

        b.remove(3);
        System.out.println("Entferne 3: " + b);

        b.remove(7);
        System.out.println("Entferne 7: " + b);
    }
}
