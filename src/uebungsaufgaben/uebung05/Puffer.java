package uebungsaufgaben.uebung05;

public interface Puffer<T> {
    void insert(T e);
    T remove();
    int size();
    boolean isEmpty();
}
