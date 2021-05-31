package uebungsaufgaben.uebung06;

public class Binaerbaum<T> {
    private final BaumEl wurzel;

    // Der Konstruktor erzeugt einen leeren Baum.
    public Binaerbaum() {
        wurzel = null;
    }

    /* Der Konstruktor nimmt ein T an das als Inhalt der Wurzel gespeichert wird und außerdem
       zwei weitere Referenzobjekte vom Typ Binaerbaum, eins für links und eins für rechts. */
    public Binaerbaum(T wurzel, Binaerbaum<T> links, Binaerbaum<T> rechts) {
        this.wurzel = new BaumEl(wurzel);
        if (links != null) {
            this.wurzel.links = links.wurzel;
        }
        if(rechts != null) {
            this.wurzel.rechts = rechts.wurzel;
        }
    }

    // Die Methode gibt einen Wahrheitswert zurück, ob der Baum leer ist.
    public boolean isEmpty() {
        return wurzel == null;
    }

    // Die Methode berechnet die Höhe des Baumes rekursiv und gibt den Wert zurück.
    public int hoehe() {
        return hoehe(wurzel);
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
        return toString(wurzel);
    }
    private String toString(BaumEl e) {
        if (e == null) {
            return "";
        } else {
            return "<" + toString(e.links) + ">" + "<" + e.data + ">" + "<" + toString(e.rechts) + ">";
        }
    }

    /* Bei dieser Methode wird der Baum in preorder traversiert und die entsprechenden Inhalte
       auf dem Bildschirm ausgegeben. [Wurzel - Links - Rechts] */
    public String preorder() {
        return preorder(wurzel);
    }
    private String preorder(BaumEl e) {
        if (e != null) {
            String s = "";
            if (e.data != null) {
                s += e.data + " ";
            }
            if (e.links != null) {
                s += preorder(e.links);
            }
            if (e.rechts != null) {
                s += preorder(e.rechts);
            }
            return s;
        }
        return "";
    }

    /* Bei dieser Methode wird der Baum in inorder traversiert und die entsprechenden Inhalte
       auf dem Bildschirm ausgegeben. [Links - Wurzel - Rechts] */
    public String inorder() {
        return inorder(wurzel);
    }
    private String inorder(BaumEl e) {
        if (e != null) {
            String s = "";
            if (e.links != null) {
                s += inorder(e.links);
            }
            if (e.data != null) {
                s += e.data + " ";
            }
            if (e.rechts != null) {
                s += inorder(e.rechts);
            }
            return s;
        }
        return "";
    }
    /* Bei dieser Methode wird der Baum in postorder traversiert und die entsprechenden Inhalte
       auf dem Bildschirm ausgegeben. [Links - Rechts - Wurzel] */
    public String postorder() {
        return postorder(wurzel);
    }
    private String postorder(BaumEl e) {
        if (e != null) {
            String s = "";
            if (e.links != null) {
                s += postorder(e.links);
            }
            if (e.rechts != null) {
                s += postorder(e.rechts);
            }
            if (e.data != null) {
                s += e.data + " ";
            }
            return s;
        }
        return "";
    }

    // private Klasse zur Instanziierung eines Knoten
    private class BaumEl {
        private final T data;
        private BaumEl links, rechts = null;

        public BaumEl(T data) {
            this.data = data;
        }
    }
}
