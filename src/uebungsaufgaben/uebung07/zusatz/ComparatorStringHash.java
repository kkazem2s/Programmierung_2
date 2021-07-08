package uebungsaufgaben.uebung07.zusatz;

import java.util.Comparator;

public class ComparatorStringHash implements Comparator<String> {
    /* In der Theorie ist ein mögliches Problem bei einem Vergleich über Hash-Werte, dass es
       mehr verschiedene Objekte geben kann, als mögliche Hash-Werte. Somit könnte ein Fall eintreten,
       dass Objekte zwar verschieden sind, aber trotzdem denselben Hash-Wert zugewiesen bekommen.
       Deshalb sollten Vergleiche über einzigartige Keys oder Values des jeweiligen Objektes erfolgen
       für eine korrekte Sortierung. */
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.hashCode(), o2.hashCode());
    }
}
