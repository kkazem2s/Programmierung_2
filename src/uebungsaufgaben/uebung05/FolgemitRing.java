package uebungsaufgaben.uebung05;

import uebungsaufgaben.uebung04.Ringpuffer;

import java.util.NoSuchElementException;

public class FolgemitRing<T> implements Folge<T> {
    private Ringpuffer<T> ringpuffer;
    private int size;

    public FolgemitRing(int capacity) {
        ringpuffer = new Ringpuffer<>(capacity);
        size = 0;
    }

    @Override
    public void set(int pos, T e) throws NoSuchElementException {
        if (pos < 0) {
            throw new NoSuchElementException();
        } else {
            if (pos > ringpuffer.size()) {
                ringpuffer.addLast(e);
            } else {
                ringpuffer.set(pos,e);
            }
            size++;
        }
    }

    @Override
    public T get(int index) throws NoSuchElementException {
        if (index < 0 || index > size) {
            throw new NoSuchElementException();
        } else {
            size--;
            return ringpuffer.get(index);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void insert(T e) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public T remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return ringpuffer.toString();
    }
}
