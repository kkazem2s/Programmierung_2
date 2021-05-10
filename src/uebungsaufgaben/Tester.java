package uebungsaufgaben;

public class Tester {
    public static void main(String[] args) {
        Lifo l = new Lifo(5);
        l.push(7);
        l.push(3);
        l.push(3);
        l.push(1);
        System.out.println(l.size());

        System.out.println(l.pop());
        System.out.println(l.pop());
        System.out.println(l.pop());
        System.out.println(l.pop());

        System.out.println(l.size());
    }
}
