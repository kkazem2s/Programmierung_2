package uebungsaufgaben.uebung04;

@SuppressWarnings("unchecked")
public class DynArray<T> {
    private T[] dynArray;
    private int size;

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

    public void addFirst(T e) {
        if (size == 1) {
            dynArray[0] = e;
            check();
        } else {
            check();
            T[] dynArray = (T[]) new Object[this.dynArray.length];
            for (int i = 1; i < dynArray.length; i++) {
                dynArray[i] = this.dynArray[i-1];
            }
            dynArray[0] = e;
            size++;
            this.dynArray = dynArray;
        }
    }

    public void addLast(T e) {
        check();
        T[] dynArray = (T[]) new Object[this.dynArray.length];
        dynArray[size] = e;
        size++;
        this.dynArray = dynArray;
    }

    public T removeFirst() {
        T[] dynArray = (T[]) new Object[this.dynArray.length];
        T tmp = this.dynArray[0];
        for(int i = 1; i < dynArray.length; i++) {
            dynArray[i] = this.dynArray[i];
        }
        this.dynArray = dynArray;
        size--;
        check();
        return tmp;
    }

    public T removeLast() {
        T[] dynArray = (T[]) new Object[this.dynArray.length];
        T tmp = this.dynArray[this.dynArray.length-1];
        for(int i = 0; i < this.dynArray.length-1; i++) {
            dynArray[i] = this.dynArray[i];
        }
        this.dynArray = dynArray;
        size--;
        check();
        return tmp;
    }

    private void check() {
        if (size == dynArray.length-1) {
            doubleSize();
        } else {
            if (dynArray.length*4 <= size) {
                halfSize();
            }
        }
    }

    private void doubleSize() {
        T[] dynArray = (T[]) new Object[this.dynArray.length*2];
        for (int i = 0; i < this.dynArray.length; i++) {
            dynArray[i] = dynArray[i];
        }
        this.dynArray = dynArray;
    }

    private void halfSize() {
        T[] dynArray = (T[]) new Object[this.dynArray.length/2];
        for (int i = 0; i < this.dynArray.length; i++) {
            dynArray[i] = dynArray[i];
        }
        this.dynArray = dynArray;
    }
    public String toString() {
        String erg = "[";
        for(int i = 0; i < dynArray.length-1; i++) {
            erg += dynArray[i].toString() + ",";
        }
        erg += dynArray[dynArray.length-1].toString() + "]";
        return erg;
    }
}
