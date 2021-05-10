package uebungsaufgaben.uebung03.zusatz;

import uebungsaufgaben.uebung03.RDVL;

public class Josephus {
    public static int loese(int n, int k) {
        RDVL<Integer> josephus = new RDVL<>();
        for (int i = 0; i < n; i++) {
            josephus.add(i+2);
        }
        while(josephus.size() >= 1) {
            josephus.next(k);
            josephus.remove();
        }
        return josephus.element();
    }
}
