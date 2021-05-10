package verketteteListen;

public class Tester {
    public static void main(String [] args){
        //evlTest();
        //System.out.println("------------------");
        //evlfifoTest();
        //zipTest();
        //rdvlTest();
    }
    public static void evlfifoTest() {
        FifomitEVL<Integer> fifo = new FifomitEVL<>();

        fifo.push(1);
        fifo.push(2);
        fifo.push(3);
        fifo.push(4);

        System.out.println(fifo.peek());
        System.out.println(fifo.pop());
        System.out.println(fifo.pop());
        System.out.println(fifo.pop());
        System.out.println(fifo.pop());
        System.out.println(fifo.isEmpty());
    }
    public static void evlTest() {
        EVL<Integer> zahlen = new EVL<>();

        zahlen.addFirst(2);
        zahlen.addLast(3);
        zahlen.addFirst(1);
        zahlen.addLast(4);

        System.out.println(zahlen);
        //zahlen.removeFirst();
        //System.out.println(zahlen);
        //zahlen.removeLast();
        zahlen.add(2,10);
        System.out.println(zahlen);
        zahlen.remove(2);
        System.out.println(zahlen);
        System.out.println("Contains 1?: " + zahlen.contains(1));
        System.out.println("Contains 4?: " + zahlen.contains(4));
        System.out.println("Size?: " + zahlen.size());
        zahlen.removeFirst();
        zahlen.removeFirst();
        zahlen.removeFirst();
        zahlen.removeFirst();
        System.out.println(zahlen.size());
    }
    public static void zipTest() {
        EVL<Integer> a = new EVL<>();
        EVL<Integer> b = new EVL<>();
        EVL<Integer> c = new EVL<>();
        EVL<Integer> d = new EVL<>();

        a.addLast(4);
        a.addLast(1);
        a.addLast(7);

        b.addLast(3);
        b.addLast(5);
        b.addLast(2);
        b.addLast(8);
        b.addLast(6);

        c.addLast(20);
        c.addLast(20);
        c.addLast(20);
        c.addLast(20);
        c.addLast(20);

        a.zip(b);
        c.zip(a);
        a.zip(c);

        a.zip(d);
        d.zip(a);
    }
    public static void rdvlTest() {
        RDVL<Integer> rdvl = new RDVL<>();

        rdvl.add(1);
        System.out.println(rdvl);
        rdvl.add(2);
        System.out.println(rdvl);
        rdvl.add(3);
        System.out.println(rdvl);
        rdvl.add(4);
        System.out.println(rdvl);
        rdvl.add(5);
        System.out.println(rdvl);

        rdvl.remove();
        System.out.println(rdvl);
        rdvl.remove();


        System.out.println(rdvl);

        rdvl.next(2);
        System.out.println(rdvl);

        rdvl.prev(1);
        System.out.println(rdvl);
    }
}
