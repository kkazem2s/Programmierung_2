package uebungsaufgaben.uebung02;

public class Paar<E, Z> {
    private E e;
    private Z z;

    public Paar(E e, Z z) {
        this.e = e;
        this.z = z;
    }

    public void setErstes(E e) {
        this.e = e;
    }
    public E getErstes() {
        return e;
    }
    public void setZweites(Z z) {
        this.z = z;
    }
    public Z getZweites() {
        return z;
    }
    public void setBeide(E e, Z z) {
        setErstes(e);
        setZweites(z);
    }
    public boolean equals(Paar<E,Z> p) {
        return e.equals(p.e) && z.equals(p.z);
    }
    public String toString() {
        return "(" + e + "," + z + ")";
    }
}
