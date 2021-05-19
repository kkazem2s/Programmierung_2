package uebungsaufgaben.uebung05;

import uebungsaufgaben.uebung04.Ringpuffer;

public class FolgemitRing<T> implements Folge<T> {
    private Ringpuffer<T> ringpuffer;

    public FolgemitRing(int capacity) {
        ringpuffer = new Ringpuffer<>(capacity);
    }

    @Override
    public void set(int pos, T e) throws IndexOutOfBoundsException {
        ringpuffer.set(pos, e);
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        return ringpuffer.get(index);
    }

    @Override
    public int size() {
        return ringpuffer.size();
    }

    @Override
    public boolean isEmpty() {
        return ringpuffer.size() == 0 || ringpuffer.size() == -1;
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
