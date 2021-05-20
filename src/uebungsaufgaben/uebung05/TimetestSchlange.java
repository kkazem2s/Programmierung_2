package uebungsaufgaben.uebung05;

public class TimetestSchlange {
    static SchlangemitRing<Integer> ring = new SchlangemitRing<>(10000);
    static SchlangemitDynArray<Integer> dynArray = new SchlangemitDynArray<>();

    public static void main(String [] args) {
        int ringWon = 0;
        int dynArrayWon = 0;
        int even = 0;
        for(int i = 0; i < 100; i++) {
            long r = ringComplexity();
            long d = dynArrayComplexity();
            System.out.println("Ring: " + r + "ms");
            System.out.println("DynArray: " + d + "ms");
            System.out.println("---------------------------");

            if (r < d) {
                ringWon++;
            }
            if (d < r) {
                dynArrayWon++;
            }
            if (d == r) {
                even++;
            }
        }
        System.out.println("Ring faster in " + ringWon + " cases");
        System.out.println("DynArray faster in " + dynArrayWon + " cases");
        System.out.println("Even in " + even + " cases");
    }

    public static long ringComplexity() {
        long start = System.currentTimeMillis();
        for(int i = 0;i < 10000; i++) {
            ring.insert(i);
        }
        for(int i = 0;i < 10000; i++) {
            ring.remove();
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }
    public static long dynArrayComplexity() {
        long start = System.currentTimeMillis();
        for(int i = 0;i < 10000; i++) {
            dynArray.insert(i);
        }
        for(int i = 0;i < 10000; i++) {
            dynArray.remove();
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
