package uebungsaufgaben.uebung03;

public class Josephus {
    public static int loese(int n, int k) {
        RDVL<Integer> josephus = new RDVL<>();
        for (int i = n; i > 0; i--) {
            josephus.add(i);
        }
        while(josephus.size() > 0) {
            josephus.next(k-1);
            josephus.remove();
        }
        return josephus.element();
    }
}
