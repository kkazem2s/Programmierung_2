package uebungsaufgaben.uebung07;

public class Student extends Person implements Comparable<Student> {
    private final int matrikelnummer;

    public Student(String name, String vorname, int matrikelnummer) {
        super(name, vorname);
        this.matrikelnummer = matrikelnummer;
    }

    public boolean equals(Student s) {
        return super.equals(s) && getMatrikelnummer() == s.getMatrikelnummer();
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public String toString() {
        return getName() + ", " + getVorname() + " " + getMatrikelnummer();
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(getMatrikelnummer(), o.getMatrikelnummer());
    }
}
