package uebungsaufgaben.uebung05;

import java.util.EmptyStackException;

public interface Stack<T> extends Puffer<T> {
    T top();

    @Override
    T remove() throws EmptyStackException;
    @Override
    void insert(T e);
}
