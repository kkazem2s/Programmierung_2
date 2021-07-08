package uebungsaufgaben.uebung07;

public abstract class Person {
    private final String name;
    private final String vorname;

    public Person(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public boolean equals(Person p) {
        return getName().equals(p.getName()) && getVorname().equals(p.getVorname());
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public String toString() {
        return name + ", " + vorname;
    }

    /*
        Was würde passieren, wenn Sie die Klasse Person auch Comparable implementieren lassen und
        warum?

        Personen ließen sich mit anderen Personen vergleichen, da dies jedoch eine abstrakte Klasse ist
        können hiervon keine Objekte erstellt werden. Klassen, welche diese erweitern könnten jedoch auf die
        Methode zugreifen um eine Sortierung nach Name und Vorname zu erhalten. Diese Sortierung könnte dann in
        den entsprechenden Klassen ebenfalls erweitert werden, solange diese vorher so gewünscht ist.
     */
}
