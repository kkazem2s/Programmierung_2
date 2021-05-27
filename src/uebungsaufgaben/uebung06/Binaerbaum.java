package uebungsaufgaben.uebung06;

import java.util.Random;

public class Binaerbaum<T> {
    private BaumEl wurzel;
    private Binaerbaum<T> links;
    private Binaerbaum<T> rechts;

    // Der Konstruktor erzeugt einen leeren Baum.
    public Binaerbaum() {
        wurzel = null;
        links = null;
        rechts = null;
    }

    /* Der Konstruktor nimmt ein T an das als Inhalt der Wurzel gespeichert wird und außerdem
       zwei weitere Referenzobjekte vom Typ Binaerbaum, eins für links und eins für rechts. */
    public Binaerbaum(T wurzel, Binaerbaum<T> links, Binaerbaum<T> rechts) {
        this.wurzel = new BaumEl(wurzel);
        this.wurzel.links = links.wurzel;
        this.wurzel.rechts = rechts.wurzel;
    }

    // Codebeispiel aus der Vorlesung; Fügt Wert an eine zufällige Stelle im Baum
    public void add(BaumEl c, BaumEl k) {
        Random rand = new Random();
        if (rand.nextBoolean()) {
            if (c.links == null) {
                c.links = k;
            } else {
                add(c.links, k);
            }
        } else {
            if (c.rechts == null) {
                c.rechts = k;
            } else {
                add(c.rechts, k);
            }
        }
    }

    // Die Methode gibt einen Wahrheitswert zurück, ob der Baum leer ist.
    public boolean isEmpty() {
        return wurzel == null;
    }

    // Die Methode berechnet die Höhe des Baumes rekursiv und gibt den Wert zurück.
    public int hoehe() {
        return 1 + hoehe(wurzel);
    }

    private int hoehe(BaumEl e) {
        if (e != null) {
            int hoeheLinks = hoehe(e.links);
            int hoeheRechts = hoehe(e.rechts);

            if (hoeheLinks > hoeheRechts) {
                return 1 + hoehe(e.links);
            } else {
                return 1 + hoehe(e.rechts);
            }
        }
        return 0;
    }

    // Die Methode gibt rekursiv und ohne Instanzvariable die Anzahl der Werte im Baum als Ganzzahl zurück.
    public int size() {
        return size(wurzel);
    }
    private int size(BaumEl e) {
        if (e != null) {
            return 1 + size(e.links) + size(e.rechts);
        }
        return 0;
    }

    // Die Methode liefert eine Darstellung des Baums als Zeichenkette mit Hilfe von Rekursion.
    public String toString() {
        return "<" + toString(wurzel) + ">";
    }
    private String toString(BaumEl e) {
        if (e.data == null) {
            return "";
        } else {
            return "<" + toString(e.links) + ">" + "<" + e.data.toString() + ">" + "<" + toString(e.rechts) + ">";
        }
    }

    // private Klasse zur Instanziierung eines Knoten
    private class BaumEl {
        private T data;
        private BaumEl links;
        private BaumEl rechts;

        public BaumEl(T data) {
            this.data = data;
        }
    }
}
