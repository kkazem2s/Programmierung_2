package uebungsaufgaben.uebung03.zusatz;

public class Differenz {
    public static int differenz(int range) {
        int summeDerQuadrate = 0;
        int quadrateDerSumme = 0;

        for (int i = 0; i <= range; i++) {
            summeDerQuadrate += i*i;
            quadrateDerSumme += i;
        }

        return quadrateDerSumme * quadrateDerSumme - summeDerQuadrate;
    }
    public static void main(String [] args) {
        System.out.println("Die Differenz aus der Summe der Quadrate der ersten einhundert natürlichen Zahlen " +
                "und dem Quadrat der Summe beträgt: " + differenz(100));
    }
}
