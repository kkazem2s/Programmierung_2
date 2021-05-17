package uebungsaufgaben.uebung03;

import uebungsaufgaben.uebung00.Fifo;

public class Timetest {
    static Fifo<Integer> fifo = new Fifo<>(10000);
    static FifomitEVL<Integer> evl = new FifomitEVL<>();

    public static void main(String [] args) {
        int fifowon = 0;
        int evlwon = 0;
        int even = 0;
        for(int i = 0; i < 100; i++) {
            long f = fifoComplexity();
            long evl = evlComplexity();
            System.out.println("Fifo: " + f);
            System.out.println("EVL: " + evl);
            System.out.println("---------------------------");

            if (f < evl) {
                fifowon++;
            }
            if (evl < f) {
                evlwon++;
            }
            if (evl == f) {
                even++;
            }
        }
        System.out.println("Fifo faster in " + fifowon + " cases");
        System.out.println("EVL faster in " + evlwon + " cases");
        System.out.println("Even in " + even + " cases");
    }

    public static long fifoComplexity() {
        long start = System.currentTimeMillis();
        for(int i = 0;i < 10000; i++) {
            fifo.push(i);
        }
        for(int i = 0;i < 10000; i++) {
            fifo.pop();
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }
    public static long evlComplexity() {
        long start = System.currentTimeMillis();
        for(int i = 0;i < 10000; i++) {
            evl.push(i);
        }
        for(int i = 0;i < 10000; i++) {
            evl.pop();
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
