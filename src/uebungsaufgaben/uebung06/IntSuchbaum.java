package uebungsaufgaben.uebung06;

import java.util.NoSuchElementException;

public class IntSuchbaum extends Binaerbaum<Integer> {

    public IntSuchbaum() {
        super();
    }
    public IntSuchbaum(int i, IntSuchbaum ltb, IntSuchbaum rtb) {
        super(i,ltb,rtb);
    }

    /* Der Wert wird an der richtigen Stelle im Baum einfügt. Sollte das Element
       bereits im Baum enthalten sein, wird eine IllegalArgumentException geworfen. */
    public void insert(int i) throws IllegalArgumentException {
        insert(i, wurzel);
    }
    private void insert(int i, BaumEl e) {
        if (e != null) {
            if (i == e.data || i < 1) {
                throw new IllegalArgumentException();
            }
            if (i < e.data) {
                if (e.links == null) {
                    e.links = new BaumEl(i);
                } else {
                    insert(i, e.links);
                }
            }
            if (i > e.data) {
                if (e.rechts == null) {
                    e.rechts = new BaumEl(i);;
                } else {
                    insert(i, e.rechts);
                }
            }
        }
    }

    /* Die Methode liefert einen Wahrheitswert, ob das Element bereits im Suchbaum
       vorhanden ist. */
    public boolean contains(int i) {
        return contains(i, wurzel);
    }
    private boolean contains(int i, BaumEl e) {
        // Check if null
        if (e == null) {
            return false;
        }
        // Check if value is same
        if (e.data == i) {
            return true;
        }
        // Go next node
        if (i < e.data) {
            return contains(i, e.links);
        } else {
            return contains(i, e.rechts);
        }
    }

    /* Der entsprechende Wert wird im Baum gelöscht. Falls er nicht vorhanden ist
       wird eine NoSuchElementException geworfen. */
    public void remove(int i) throws NoSuchElementException {
        if (contains(i)) {
            remove(i, wurzel);
        }
        throw new NoSuchElementException();
    }
    private void remove(int i, BaumEl e) {
        if (e.data == i) {
            // TODO
        } else {
            if (i < e.data) {
                remove(i, e.links);
            } else {
                remove(i, e.rechts);
            }
        }
    }
}
