package uebungsaufgaben.uebung04;

public class DynArray<T> {
    private T[] dynArray;
    private int size;

    @SuppressWarnings("unchecked")
    public DynArray() {
        dynArray = (T[]) new Object[1];
        size = 1;
    }
    public int capacity() {
        return dynArray.length;
    }
    public int size() {
        return size;
    }
    public T get(int pos) {
        if (!(pos > 0 && pos < dynArray.length)) {
            throw new IndexOutOfBoundsException();
        } else {
            return dynArray[pos];
        }
    }
    public T set(int pos, T e) {
        if (!(pos > 0 && pos < dynArray.length)) {
            throw new IndexOutOfBoundsException();
        } else {
            T tmp = dynArray[pos];
            dynArray[pos] = e;
            size++;
            return tmp;
        }
    }

    @SuppressWarnings("unchecked")
    public void addFirst(T e) {
        T[] dynArray = (T[]) new Object[this.dynArray.length];
        dynArray[0] = e;
        for (int i = 1; i < dynArray.length; i++) {
            dynArray[i] = this.dynArray[i-1];
        }
        size++;
        this.dynArray = dynArray;
        check();
    }

    @SuppressWarnings("unchecked")
    public void addLast(T e) {
        T[] dynArray = (T[]) new Object[this.dynArray.length];
        dynArray[size] = e;
        size++;
        this.dynArray = dynArray;
        check();
    }

    public T r

    private void check() {
        if (size == dynArray.length-1) {
            doubleSize();
        } else {
            if (dynArray.length*4 <= size) {
                halfSize();
            }
        }
    }
    @SuppressWarnings("unchecked")
    private void doubleSize() {
        T[] dynArray = (T[]) new Object[this.dynArray.length*2];
        for (int i = 0; i < this.dynArray.length; i++) {
            dynArray[i] = dynArray[i];
        }
        this.dynArray = dynArray;
    }

    @SuppressWarnings("unchecked")
    private void halfSize() {
        T[] dynArray = (T[]) new Object[this.dynArray.length/2];
        for (int i = 0; i < this.dynArray.length; i++) {
            dynArray[i] = dynArray[i];
        }
        this.dynArray = dynArray;
    }
}
