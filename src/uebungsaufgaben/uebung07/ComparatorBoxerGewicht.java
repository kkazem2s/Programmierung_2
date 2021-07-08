package uebungsaufgaben.uebung07;

import java.util.Comparator;

public class ComparatorBoxerGewicht implements Comparator<Boxer> {
    @Override
    public int compare(Boxer o1, Boxer o2) {
        return Double.compare(o1.getGewicht(), o2.getGewicht());
    }
}
