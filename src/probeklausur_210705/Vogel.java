package probeklausur_210705;

public abstract class Vogel implements Tier{
    static Art art = Art.Vogel;
    String name = "";
    int anzahlBeine = 2;
    int minGroesse;
    int maxGroesse;
    int minGewicht;
    int maxGewicht;
    int lebenserwartung;

    Vogel(){	}
    Vogel(String s){name = s;}
    Vogel(int i){anzahlBeine = i;}
    Vogel(String s, int i){name = s; anzahlBeine = i;}

    @Override
    public Art art() {
        return art;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int anzahlBeine() {
        return anzahlBeine;
    }

    @Override
    public int minGroesse() {
        return minGroesse;
    }

    @Override
    public int maxGroesse() {
        return maxGroesse;
    }

    @Override
    public int minGewicht() {
        return minGewicht;
    }

    @Override
    public int maxGewicht() {
        return maxGewicht;
    }

    @Override
    public int lebenserwartung() {
        return lebenserwartung;
    }

    /* Der Vergleich soll über die Lebenserwartung der Tiere erfolgen. Der Vergleich liefert einen negativen
       Wert, wenn die Lebenserwartung kleiner ist. */
    @Override
    public int compareTo(Tier t) {
        int i = this.lebenserwartung - t.lebenserwartung();
        if (i < 0) {
            return -1;
        } else if (i > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public String toString() {
        String s = "[V";
        if(name.length()>0) s = s + ": " + name;
        else s = s + " (kein Name)";
        s += "]";
        return s;
    }
}
/**
 * @author kkazem2s - 9031334
 */