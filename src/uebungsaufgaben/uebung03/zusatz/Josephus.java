package uebungsaufgaben.uebung03.zusatz;

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
    public static void main(String [] args) {
        System.out.println(loese(41,3));
        System.out.println(loese(5,2));
    }
}
