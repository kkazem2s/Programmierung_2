package probeklausur_210705;

import java.util.Comparator;

public class TierComparatorMaxGewicht<T extends Tier> implements Comparator<Tier> {
    // Tiere über ihr maximales Gewicht vergleichen
    @Override
    public int compare(Tier t1, Tier t2) {
        int i = t1.maxGewicht() - t2.maxGewicht();
        if (i < 0) {
            return -1;
        } else if (i > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
/**
 * @author kkazem2s - 9031334
 */
