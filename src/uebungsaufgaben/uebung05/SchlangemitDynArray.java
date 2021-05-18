package uebungsaufgaben.uebung05;

import uebungsaufgaben.uebung04.DynArray;

public class SchlangemitDynArray<T> implements Schlange<T> {
    private final DynArray<T> dynArray;

    public SchlangemitDynArray() {
        dynArray = new DynArray<>();
    }

    @Override
    public void insert(T e) {
        dynArray.addFirst(e);
    }

    @Override
    public T remove() {
        return dynArray.removeLast();
    }

    @Override
    public int size() {
        return dynArray.size();
    }

    @Override
    public T first() {
        T tmp = dynArray.removeLast();
        dynArray.addLast(tmp);
        return tmp;
    }

    @Override
    public boolean isEmpty() {
        return dynArray.size() == 0;
    }

}
