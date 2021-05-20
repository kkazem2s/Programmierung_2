package uebungsaufgaben.uebung05;

public class TimetestFolge {
    private static FolgemitRing<Integer> ring = new FolgemitRing<>(10000);
    private static FolgemitEVL<Integer> evl = new FolgemitEVL<>();

    public static void main(String [] args) {
        int ringWon = 0;
        int evlWon = 0;
        int even = 0;

        for(int i = 0; i < 100; i++) {
            long r = ringComplexity();
            long e = evlComplexity();
            System.out.println("Ring: " + r + "ms");
            System.out.println("EVL: " + e + "ms");
            System.out.println("---------------------------");

            if (r < e) {
                ringWon++;
            }
            if (e < r) {
                evlWon++;
            }
            if (e == r) {
                even++;
            }
        }
        System.out.println("Ring faster in " + ringWon + " cases");
        System.out.println("EVL faster in " + evlWon + " cases");
        System.out.println("Even in " + even + " cases");
    }

    public static long ringComplexity() {
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) {
            ring.set(i,i);
        }
        for(int i = 0; i < 10000; i++) {
            ring.get(0);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }
    public static long evlComplexity() {
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) {
            evl.set(i,i);
        }
        for(int i = 0; i < 10000; i++) {
            evl.get(0);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
