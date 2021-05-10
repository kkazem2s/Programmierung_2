package uebungsaufgaben.uebung00;

import java.util.Random;

public abstract class AbstractBuffer<T> implements Buffer<T> {
    protected int size = 0;
    protected final T[] array;

    public AbstractBuffer() {
        this(new Random().nextInt(98) + 3);
    }

    @SuppressWarnings("unchecked")
    public AbstractBuffer(int capacity) {
        if(capacity < 0) {
            throw new IllegalArgumentException();
        }
        array = (T[]) new Object[capacity];
    }

    public void push(T i){
        if(size == array.length) {
            throw new IndexOutOfBoundsException();
        }
        array[size++] = i;
    }
    public int size() {
        return array.length;
    }
    public int capacity() {
        return size;
    }
    public String toString() {
        return "Capacity: " + this.capacity() + "\tSize: " + this.size();
    }
}
