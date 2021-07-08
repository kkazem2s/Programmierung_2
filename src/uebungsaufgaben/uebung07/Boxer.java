package uebungsaufgaben.uebung07;

public class Boxer extends Person implements Comparable<Boxer> {
    private final double gewicht;

    public Boxer(String name, String vorname, double gewicht) {
        super(name, vorname);
        this.gewicht = gewicht;
    }

    public boolean equals(Boxer b) {
        return super.equals(b) && getGewicht() == b.getGewicht();
    }

    public double getGewicht() {
        return gewicht;
    }

    @Override
    public int compareTo(Boxer o) {
        int result = getName().compareTo(o.getName());
        if (result == 0) {
            result = getVorname().compareTo(o.getVorname());
        }
        if (result == 0) {
            result = Double.compare(getGewicht(), o.getGewicht());
        }
        return result;
    }
}
