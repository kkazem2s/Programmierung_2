package uebungsaufgaben.uebung05;

import uebungsaufgaben.uebung04.Ringpuffer;

public class SchlangemitRing<T> implements Schlange<T> {
    private Ringpuffer<T> ringpuffer;

    public SchlangemitRing(int capacity) {
        ringpuffer = new Ringpuffer<>(capacity);
    }

    @Override
    public boolean isEmpty() {
        return ringpuffer.size() == 0 || ringpuffer.size() == -1;
    }

    @Override
    public void insert(T e) {
        ringpuffer.addFirst(e);
    }

    @Override
    public T remove() {
        return ringpuffer.removeLast();
    }

    @Override
    public T first() {
        T tmp = ringpuffer.removeLast();
        ringpuffer.addLast(tmp);
        return tmp;
    }

    @Override
    public int size() {
        return ringpuffer.size();
    }
}
