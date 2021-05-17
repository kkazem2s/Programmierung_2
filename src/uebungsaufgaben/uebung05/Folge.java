package uebungsaufgaben.uebung05;

public interface Folge<T> extends Puffer<T> {

    void insert(int pos, T e);
    T remove(int index) throws IndexOutOfBoundsException;
    void set(int pos, T e) throws IndexOutOfBoundsException;
    T get(int index) throws IndexOutOfBoundsException;

    @Override
    void insert (T e) throws UnsupportedOperationException;
    @Override
    T remove() throws UnsupportedOperationException;

}
