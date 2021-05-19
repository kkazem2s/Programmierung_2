package uebungsaufgaben.uebung05.zusatz;

public class Euler2 {
    public static int evenFibonacciRecursive(int n) {
        if (n < 1) {
            return n;
        }
        if (n == 1) {
            return 2;
        }
        return (4*evenFibonacciRecursive(n-1)) + evenFibonacciRecursive(n - 2);
    }

    public static void main(String [] args) {
        int i = 0;
        String erg = "";
        while (evenFibonacciRecursive(i) < 4000000) {
            erg += evenFibonacciRecursive(i) + ",";
            i++;
        }
        erg = erg.substring(0,erg.length()-1);
        System.out.println(erg);
    }
}
