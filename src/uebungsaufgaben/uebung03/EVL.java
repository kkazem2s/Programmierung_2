package uebungsaufgaben.uebung03;

public class EVL<T> {
    private Node head;
    private Node last;
    private int size = 0;

    private class Node {
        T data;
        Node next;

        Node (T o) {
            data = o;
        }
    }
    public void addFirst(T e) {
        Node n = new Node(e);
        if (head == null) {
            last = n;
        } else {
            n.next = head;
        }
        head = n;
        size++;
    }
    public T removeFirst() {
        if (size != 0) {
            T data = head.data;
            head = head.next;
            size--;
            return data;
        }
        return null;
    }
    public void addLast(T e) {
        Node n = new Node(e);
        if (last == null) {
            head = n;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = n;
        }
        last = n;
        size++;
    }
    public T removeLast() {
        if (size <= 0) {
            return null;
        }
        if (size == 1) {
            T data = head.data;
            head = null;
            size--;
            return data;
        } else {
            Node tmp = head;
            while (tmp.next.next != null) {
                tmp = tmp.next;
            }
            T data = tmp.next.data;
            tmp.next = null;
            size--;
            return data;
        }
    }
    public void add(int pos, T e) {
        if (pos < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            if (pos > size) {
                addLast(e);
            } else {
                if (pos == 0) {
                    addFirst(e);
                } else {
                    Node n = new Node(e);
                    Node tmp = head;
                    while (pos-1 > 0) {
                        tmp = tmp.next;
                        pos--;
                    }
                    n.next = tmp.next;
                    tmp.next = n;
                    size++;
                }
            }
        }
    }
    public T remove(int pos) {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException();
        } else {
            Node tmp = head;
            T value;
            if (pos == 0){
                value = head.data;
                head = head.next;
            } else {
                while (pos-1 > 0) {
                    tmp = tmp.next;
                    pos--;
                }
                value = tmp.next.data;
                tmp.next = tmp.next.next;
            }
            size--;
            return value;
        }
    }
    public boolean contains(T e) {
        Node tmp = head;
        while (tmp.next != null) {
            if (tmp.data.equals(e) || tmp.next.data.equals(e)) {
                return true;
            }
            tmp = tmp.next;
        }
        return tmp.data.equals(e);
    }
    public int size() {
        return size;
    }
    public String toString() {
        String erg = "[";
        Node tmp = head;
        while (tmp.next != null) {
            erg += tmp.data + ",";
            tmp = tmp.next;
        }
        erg += tmp.data + "]";
        return erg;
    }
    public EVL<T> zip(EVL<T> other) {
        EVL<T> zipped = new EVL<>();
        Node thisPointer = this.head;
        Node otherPointer = other.head;
        int count = 0;

        while (thisPointer != null & otherPointer != null) {
            if (count % 2 == 0) {
                zipped.addLast(thisPointer.data);
                thisPointer = thisPointer.next;
            } else {
                zipped.addLast(otherPointer.data);
                otherPointer = otherPointer.next;
            }
            count++;
        }
        if (thisPointer == null) {
            while (otherPointer != null) {
                zipped.addLast(otherPointer.data);
                otherPointer = otherPointer.next;
            }
        } else {
            while (thisPointer != null) {
                zipped.addLast(thisPointer.data);
                thisPointer = thisPointer.next;
            }
        }
        return zipped;
    }
}
