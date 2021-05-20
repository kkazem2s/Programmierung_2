package uebungsaufgaben.uebung04;

@SuppressWarnings("unchecked")
public class DynArray<T> {
    private T[] dynArray;
    private int size;

    public DynArray() {
        size = 0;
        dynArray = (T[]) new Object[1];
    }

    public void addFirst(T e) {
        check();
        T[] dynArray = (T[]) new Object[this.dynArray.length];
        for (int i = 1; i < dynArray.length; i++) {
            dynArray[i] = this.dynArray[i-1];
        }
        dynArray[0] = e;
        size++;
        this.dynArray = dynArray;
    }

    public void addLast(T e) {
        check();
        this.dynArray[size] = e;
        size++;
    }

    public T removeFirst() {
        if (size == 0) {
            throw new IndexOutOfBoundsException();
        } else {
            T[] dynArray = (T[]) new Object[this.dynArray.length];
            T tmp = this.dynArray[0];
            for(int i = 1; i < dynArray.length; i++) {
                dynArray[i-1] = this.dynArray[i];
            }
            this.dynArray = dynArray;
            size--;
            check();
            return tmp;
        }
    }

    public T removeLast() {
        if (size == 0) {
            throw new IndexOutOfBoundsException();
        } else {
            T[] dynArray = (T[]) new Object[this.dynArray.length];
            T tmp = this.dynArray[size-1];
            for(int i = 0; i < this.dynArray.length-1; i++) {
                dynArray[i] = this.dynArray[i];
            }
            this.dynArray = dynArray;
            size--;
            check();
            return tmp;
        }
    }

    public T get(int pos) {
        pos -= 1;
        if (pos < 0 || pos > size-1) {
            throw new IndexOutOfBoundsException();
        } else {
            return dynArray[pos];
        }
    }

    public T set(int pos, T e) {
        pos -= 1;
        if (pos < 0 || pos > size-1) {
            throw new IndexOutOfBoundsException();
        } else {
            T tmp = dynArray[pos];
            dynArray[pos] = e;
            size++;
            return tmp;
        }
    }

    private void check() {
        if (size == dynArray.length) {
            doubleSize();
        } else {
            if ((size-1)*4 == dynArray.length || size == 1) {
                halfSize();
            }
        }
    }
    private void doubleSize() {
        T[] dynArray = (T[]) new Object[this.dynArray.length*2];
        for (int i = 0; i < this.dynArray.length; i++) {
            dynArray[i] = this.dynArray[i];
        }
        this.dynArray = dynArray;
    }
    private void halfSize() {
        T[] dynArray = (T[]) new Object[this.dynArray.length/2];
        for (int i = 0; i < dynArray.length; i++) {
            dynArray[i] = this.dynArray[i];
        }
        this.dynArray = dynArray;
    }

    public int capacity() {
        return dynArray.length;
    }
    public int size() {
        return size;
    }

    public String toString() {
        String erg = "[";
        for (int i = 0; i < size-1; i++) {
            erg += dynArray[i] + ",";
        }
        erg += dynArray[size-1] + "]";
        return erg;
    }
}
