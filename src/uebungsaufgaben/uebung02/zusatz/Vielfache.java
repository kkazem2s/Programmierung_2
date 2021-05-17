package uebungsaufgaben.uebung02.zusatz;

public class Vielfache {
    public static int vielfache(int range) {
        int erg = 0;
        for (int i = 1; i < range; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                erg += i;
            }
        }
        return erg;
    }
    public static void main(String [] args) {
        System.out.println("Die Summe aller Vielfachen von 3 oder 5 unter 1000 entspricht: " + vielfache(1000));
    }
}
