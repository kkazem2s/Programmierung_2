package uebungsaufgaben.uebung00;

public interface Buffer<T> {
    public void push(T o);
    public T pop();
    public int size();
    public int capacity();
}
