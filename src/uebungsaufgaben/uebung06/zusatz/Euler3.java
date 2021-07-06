package uebungsaufgaben.uebung06.zusatz;

public class Euler3 {
    // Verwendung von Datentyp 'long', da die Ausgangszahl den MAX.Value überschreitet

    public static void main( String[] args ) {
        System.out.println("Was ist der größte Primfaktor der Zahl 13195?");
        maxPrimfactor(13195);
        System.out.println("Was ist der größte Primfaktor der Zahl 600851475143?");
        maxPrimfactor(600851475143L);
    }

    public static void maxPrimfactor(long l) {
        int counter = 2;

        while (counter <= (int) Math.sqrt(l) && l > 1) {
            if (l % counter == 0 ) {
                l /= counter;
                System.out.printf( "%s %s", counter, l == 1 ? "" : "* ");
            }
            else {
                counter++;
            }
        }
        if (l != 1) {
            System.out.println(l);
        }
    }
}
