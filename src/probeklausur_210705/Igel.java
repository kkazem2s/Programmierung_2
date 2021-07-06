package probeklausur_210705;

public class Igel extends Saeugetier{

    Igel(){
        minGroesse = 10;
        maxGroesse = 45;
        minGewicht = 20;
        maxGewicht = 2000;
        lebenserwartung= 7;
    }
    Igel(String s){this(); name = s;}
    Igel(int i){this(); anzahlBeine = i;}
    Igel(String s, int i){this(); name = s; anzahlBeine = i;}
}
