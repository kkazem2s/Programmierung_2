package uebungsaufgaben.uebung06;

import java.util.NoSuchElementException;

public class IntSuchbaum extends Binaerbaum<Integer> {
/* Die Nutzung der compareTo Methode des Interfaces Comparable wird ermöglich durch die bereits
   vorhandene Implementierung des Datentypes 'Integer', welcher in dieser Klasse benutzt wird.
 */
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
            if (e.data.compareTo(i) == 0 || i < 1) {
                throw new IllegalArgumentException();
            }
            if (e.data.compareTo(i) < 0) {
                if (e.links == null) {
                    e.links = new BaumEl(i);
                } else {
                    insert(i, e.links);
                }
            }
            if (e.data.compareTo(i) > 0) {
                if (e.rechts == null) {
                    e.rechts = new BaumEl(i);
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
        if (e.data.compareTo(i) == 0) {
            return true;
        }
        // Go next node
        if (e.data.compareTo(i) < 0) {
            return contains(i, e.links);
        } else {
            return contains(i, e.rechts);
        }
    }

    /* Der entsprechende Wert wird im Baum gelöscht. Falls er nicht vorhanden ist
       wird eine NoSuchElementException geworfen. */
    public BaumEl remove(int i) throws NoSuchElementException {
        if (!contains(i)) {
            throw new NoSuchElementException();
        }
        return remove(i, wurzel);
    }
    /* Der Suchbaum wird rekursiv durchlaufen und prüft wieviele Nachfolger der zu
       löschende Knoten besitzt. Dementsprechen wird entweder der Wert lediglich
       gelöscht, der Nachfolger "hochgezogen" oder der kleinste Wert des rechten
       Teilbaumes als Ersatz verschoben. */
    private BaumEl remove(int i, BaumEl e) {
        if (e == null) {
            return null;
        }
        if (e.data.compareTo(i) < 0) {
            e.links = remove(i, e.links);
        } else if (e.data.compareTo(i) > 0) {
            e.rechts = remove(i, e.rechts);
        } else {
            if (e.links == null) {
                return e.rechts;
            } else if (e.rechts == null) {
                return e.links;
            } else {
                e.data = getNachfolger(e.rechts);
                e.rechts = remove(e.data, e.rechts);
            }
        }
        return e;
    }

    /* Damit keine Löcher entstehen, müssen die Werte aus den unteren Teilbäumen hochgezogen werden,
       dabei dürfen die Regeln des Suchbaums nicht verletzt werden. Dafür wird aus dem rechten Teilbaum
       der kleinste Wert herausgesucht. */
    private int getNachfolger(BaumEl e) {
        int val = e.data;

        while (e.links != null) {
            val = e.links.data;
            e = e.links;
        }
        return val;
    }
}