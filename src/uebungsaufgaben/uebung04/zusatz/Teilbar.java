package uebungsaufgaben.uebung04.zusatz;

public class Teilbar {
    public static int teilbar(int n) {
        int erg = 1;
        boolean solved = false;

        while(!solved) {
            erg++;
            for(int i = 1; i <= n; i++) {
                if (erg % i != 0) {
                    break;
                } else {
                    if (i == n) {
                        solved = true;
                        break;
                    }
                }
            }
        }
        return erg;
    }
    public static void main(String [] args) {
        System.out.println(teilbar(20));
    }
}
