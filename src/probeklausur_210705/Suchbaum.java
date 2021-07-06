package probeklausur_210705;

import java.util.Comparator;

public class Suchbaum<T extends Tier> {
    private IterierbareArche<Tier> iterierbareArche;
    private Arche<Tier> arche;
    private Comparator<Tier> comp;

    public Suchbaum(IterierbareArche<Tier> i) {
        iterierbareArche = i;
    }

    public Suchbaum(Arche<Tier> a, Comparator<Tier> c) {
        arche = a;
        comp = c;
    }

    class Node {
        T elem;
        Node left;
        Node right;
    }
}
/**
 * @author kkazem2s - 9031334
 */