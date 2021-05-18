package uebungsaufgaben.uebung05;

import uebungsaufgaben.uebung04.Ringpuffer;

import java.util.NoSuchElementException;

public class FolgemitRing<T> implements Folge<T> {
    private Ringpuffer<T> ringpuffer;

    public FolgemitRing(int capacity) {
        ringpuffer = new Ringpuffer<>(capacity);
    }

    @Override
    public void set(int pos, T e) throws IndexOutOfBoundsException, NoSuchElementException {

    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void insert(T e) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public T remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
