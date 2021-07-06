package probeklausur_210705;

public class Hase extends Saeugetier{
    Hase(){
        minGroesse = 25;
        maxGroesse = 70;
        minGewicht = 400;
        maxGewicht = 7000;
        lebenserwartung= 9;
    }
    Hase(String s){this(); name = s;}
    Hase(int i){this(); anzahlBeine = i;}
    Hase(String s, int i){this(); name = s; anzahlBeine = i;}
}
