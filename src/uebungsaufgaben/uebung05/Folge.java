package uebungsaufgaben.uebung05;

import java.util.NoSuchElementException;

public interface Folge<T> extends Puffer<T> {
    void set(int pos, T e) throws NoSuchElementException;
    T get(int index) throws NoSuchElementException;
    @Override
    void insert (T e) throws UnsupportedOperationException;
    @Override
    T remove() throws UnsupportedOperationException;
}
