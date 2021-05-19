package uebungsaufgaben.uebung05;

import uebungsaufgaben.uebung03.EVL;

public class FolgemitEVL<T> implements Folge<T> {
    private EVL<T> evl;

    @Override
    public void set(int pos, T e) throws IndexOutOfBoundsException {
        evl.add(pos, e);
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        return evl.remove(index);
    }

    @Override
    public int size() {
        return evl.size();
    }

    @Override
    public boolean isEmpty() {
        return evl.size() == 0;
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
