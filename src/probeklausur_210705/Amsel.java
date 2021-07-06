package probeklausur_210705;

public class Amsel extends Vogel{
    Amsel(){
        minGroesse = 24;
        maxGroesse = 27;
        minGewicht = 71;
        maxGewicht = 150;
        lebenserwartung= 10;
    }
    Amsel(String s){this(); name = s;}
    Amsel(int i){this(); anzahlBeine = i;}
    Amsel(String s, int i){this(); name = s; anzahlBeine = i;}

    @Override
    public int compareTo(Tier o) {
        return 0;
    }
}
