package uebungsaufgaben.uebung04;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class Ringpuffer<T> {
    private final T[] array;
    private int head = -1;
    private int size;

    public Ringpuffer(int capacity) {
        if (capacity <= 0) {
            throw new IndexOutOfBoundsException();
        } else {
            array = (T[]) new Object[capacity];
            size = 0;
        }
    }

    public void addFirst(T e) {
        if (head == -1) {
            array[0] = e;
            head = 0;
        } else {
            for(int i = head; i < size; i++) {

            }
        }
        size++;
    }
    public void addLast(T e) {
        if (array[array.length-1] != null) {
            for (int i = 1; i < array.length; i++) {
                array[i-1] = array[i];
            }
        }
        array[array.length-1] = e;
        size++;
    }

    public T removeFirst() {
        T tmp = array[0];
        array[0] = null;
        size--;
        return tmp;
    }
    public T removeLast() {
        T tmp = array[array.length-1];
        array[array.length-1] = null;
        size--;
        return tmp;
    }

    public int size() {
        return size();
    }
    public String toString() {
        return Arrays.toString(array);
    }
}
