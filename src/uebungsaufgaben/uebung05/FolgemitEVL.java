package uebungsaufgaben.uebung05;

import uebungsaufgaben.uebung03.EVL;

import java.util.NoSuchElementException;

public class FolgemitEVL<T> implements Folge<T> {
    private EVL<T> evl;
    private int size = 0;

    public FolgemitEVL() {
        evl = new EVL<>();
    }

    @Override
    public void set(int pos, T e) throws IndexOutOfBoundsException {
        if (pos < 0) {
            throw new NoSuchElementException();
        } else {
            if (size == 0) {
                evl.addFirst(e);
            } else {
                if (pos > size) {
                    evl.addLast(e);
                } else {
                    evl.add(pos, e);
                }
            }
            size++;
        }
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException, NoSuchElementException {
        if (index < 0 || index > size) {
            throw new NoSuchElementException();
        } else {
            size--;
            return evl.remove(index);
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
        return evl.toString();
    }
}
