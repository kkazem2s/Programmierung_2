package probeklausur_210705;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class IterierbareArche<T extends Tier> extends Arche<T> implements Iterable<T> {

    @Override
    public Iterator<T> iterator() {
        return new ArcheIterator<T>(this);
    }

    static class ArcheIterator<T> implements Iterator<T> {
        private final Arche<Tier> arche;

        ArcheIterator(Arche a) {
            arche = a;
        }
        @Override
        public boolean hasNext() {
            return arche.getSize() > 0;
        }
        @Override
        public T next() {
            return (T) arche.remove();
        }
    }
}
/**
 * @author kkazem2s - 9031334
 */