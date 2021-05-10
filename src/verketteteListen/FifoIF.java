package verketteteListen;

public interface FifoIF<T> {
    void push(T e);
    T pop();
    T peek();
    int size();
    boolean isEmpty();
}
