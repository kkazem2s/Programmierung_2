package uebungsaufgaben.uebung02;

import uebungsaufgaben.uebung00.Lifo;

public class LifoPaar {
    public static void main(String [] args) {
        Lifo<Paar<Integer, String>> paarLifo = new Lifo<>();

        paarLifo.push(new Paar<>(4, "Goodbye"));
        paarLifo.push(new Paar<>(3, "!"));
        paarLifo.push(new Paar<>(2, "World"));
        paarLifo.push(new Paar<>(1, "Hello"));

        System.out.println(paarLifo.pop());
        System.out.println(paarLifo.pop());
        System.out.println(paarLifo.pop());
        System.out.println(paarLifo.pop());
    }
}
