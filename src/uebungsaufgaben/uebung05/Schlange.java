package uebungsaufgaben.uebung05;

public interface Schlange<T> extends Puffer<T> {
    T first();

    @Override
    void insert(T e) throws UnsupportedOperationException;
    @Override
    T remove() throws UnsupportedOperationException;
}
