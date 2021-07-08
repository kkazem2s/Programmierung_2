package uebungsaufgaben.uebung07;

import uebungsaufgaben.uebung06.Binaerbaum;

import java.util.Comparator;

public class Suchbaum<T extends Comparable<T>> extends Binaerbaum<T> {
    private final Comparator<T> comparator;

    public Suchbaum() {
        comparator = null;
    }
    public Suchbaum(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public boolean insert(T element) {
        return insert(element, wurzel);
    }
    private boolean insert(T element, BaumEl e) {
        if (e == null) {
            e = new BaumEl(element);
        } else {
            if (comparator != null) {
                if (comparator.compare(element, e.data) == 0) {
                    return false;
                } else if (comparator.compare(element, e.data) < 0) {
                    insert(element, e.links);
                } else {
                    insert(element, e.rechts);
                }
            } else {
                if (element.compareTo(e.data) == 0) {
                    return false;
                } else if (element.compareTo(e.data) < 0) {
                    insert(element, e.links);
                } else {
                    insert(element, e.rechts);
                }
            }
        }
        return true;
    }

    public boolean contains(T element) {
        return contains(element, wurzel);
    }
    private boolean contains(T element, BaumEl e) {
        if (e != null) {
            if (comparator != null) {
                if (comparator.compare(element, e.data) == 0) {
                    return true;
                } else if (comparator.compare(element, e.data) < 0) {
                    contains(element, e.links);
                } else {
                    contains(element, e.rechts);
                }
            } else {
                if (element.compareTo(e.data) == 0) {
                    return true;
                } else if (element.compareTo(e.data) < 0) {
                    contains(element, e.links);
                } else {
                    contains(element, e.rechts);
                }
            }
        }
        return false;
    }

    public boolean remove(T element) {
        if (!contains(element)) {
            return false;
        }
        return remove(element, wurzel, null);
    }
    private boolean remove(T element, BaumEl e, BaumEl p) {
        if (e == null) {
            return false;
        }
        if (comparator != null) {
            if (comparator.compare(element, e.data) == 0) {
                if (comparator.compare(element, p.links.data) == 0) {
                    p.links = null;
                } else {
                    p.rechts = null;
                }
            } else {
                if (comparator.compare(element, e.data) < 0) {
                    remove(element, e.links, e);
                } else {
                    remove(element, e.rechts, e);
                }
            }
        } else {
            if (element.compareTo(e.data) == 0) {
                if (element.compareTo(p.links.data) == 0) {
                    p.links = null;
                } else {
                    p.rechts = null;
                }
            } else {
                if (element.compareTo(e.data) < 0) {
                    remove(element, e.links, e);
                } else {
                    remove(element, e.rechts, e);
                }
            }
        }
        return true;
    }

    private T getNachfolger(BaumEl e) {
        if (e.rechts == null) {
            return e.data;
        }
        return getNachfolger(e.rechts);
    }
}
