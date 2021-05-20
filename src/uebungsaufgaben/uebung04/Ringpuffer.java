package uebungsaufgaben.uebung04;

@SuppressWarnings("unchecked")
public class Ringpuffer<T> {
    private final T[] array;
    private int head = -1;
    private int size = 0;

    public Ringpuffer(int capacity) {
        if (capacity <= 0) {
            throw new IndexOutOfBoundsException();
        } else {
            array = (T[]) new Object[capacity];
        }
    }

    public void addFirst(T e) {
        if (size == array.length) {
            throw new IndexOutOfBoundsException();
        } else {
            if (head == -1) {
                head = 0;
            } else {
                for (int i = size; i > head && i > 0; i--) {
                    array[(head + i) % array.length] = array[((head + i) % array.length) - 1];
                }
            }
            array[head] = e;
            size++;
        }
    }
    public void addLast(T e) {
        if (size == array.length) {
            throw new IndexOutOfBoundsException();
        } else {
            if (head == -1) {
                head = 0;
                array[head] = e;
            } else {
                array[(head + size) % array.length] = e;
            }
            size++;
        }
    }

    public T removeFirst() {
        if (size == 0) {
            throw new IndexOutOfBoundsException();
        } else {
            T tmp = array[head];
            array[head] = null;
            size--;
            head++;
            head = head % array.length;
            return tmp;
        }
    }
    public T removeLast() {
        if (size == 0) {
            throw new IndexOutOfBoundsException();
        } else {
            T tmp = array[(head + size - 1) % array.length];
            array[(head + size - 1) % array.length] = null;
            size--;
            return tmp;
        }
    }

    public T get(int pos) {
        if (pos < 0 || pos > array.length) {
            throw new IndexOutOfBoundsException();
        } else {
            T tmp = array[(head + pos) % array.length];
            for (int i = pos; i < size-1; i++) {
                array[i] = array[i+1];
            }
            size--;
            return tmp;
        }
    }
    public void set(int pos, T e) {
        if (pos < 0 || pos > array.length) {
            throw new IndexOutOfBoundsException();
        } else {
            if (pos == 0) {
                addFirst(e);
            } else {
                array[(head + pos) % array.length] = e;
            }
        }
    }

    public int size() {
        return size;
    }
    public String toString() {
        if (size == 0) {
            return "[ ]";
        } else {
            String erg = "[";
            for (int i = head; i < size-1; i++) {
                erg += array[i] + ", ";
            }
            erg += array[size-1] + "]";
            return erg;
        }
    }
}
