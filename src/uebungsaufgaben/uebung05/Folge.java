package uebungsaufgaben.uebung05;

import java.util.NoSuchElementException;

public interface Folge<T> extends Puffer<T> {

    void set(int pos, T e) throws IndexOutOfBoundsException, NoSuchElementException;
    T get(int index) throws IndexOutOfBoundsException;
    @Override
    void insert (T e) throws UnsupportedOperationException, NoSuchElementException;
    @Override
    T remove() throws UnsupportedOperationException, NoSuchElementException;
}
