package probeklausur_210705;

public interface Tier extends Comparable<Tier> {
    Art art();			// liefert immer die Art
    String name();		// Name des Tieres
    int anzahlBeine();	// liefert die Anzahl der Beine
    int minGroesse();	// liefert die (typische) minimale Größe (in cm)
    int maxGroesse();	// liefert die (typische) maximale Größe
    int minGewicht();	// liefert das (typische) minimale Gewicht (in Gramm)
    int maxGewicht();	// liefert das (typische) maximale Gewicht (in Gramm)
    int lebenserwartung();	// liefert die (typische) Lebenserwartung (in Jahre)
    int compareTo(Tier o); // Vergleich über die Lebenserwartung der Tiere
}
/**
 * @author kkazem2s - 9031334
 */