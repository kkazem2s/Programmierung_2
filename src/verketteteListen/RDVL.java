package verketteteListen;

public class RDVL<T> {
    Node entry;
    int size = 0;

    private class Node {
        Node prev;
        Node next;
        T data;

        Node(T data) {
            this.data = data;
        }
    }

    public void add(T e) {
        Node n = new Node(e);
        if (entry == null) {
            entry = n;
            entry.next = entry;
            entry.prev = entry;
        } else {
            n.next = entry;
            n.prev = entry.prev;

            Node tmp = entry.prev;
            tmp.next = n;
            entry.prev = n;

            entry = n;

        }
        size++;
    }
    public T remove() {
        if (entry == null) {
            return null;
        }
        Node tmp = entry;
        entry.prev.next = entry.next;
        entry.next.prev = entry.prev;
        entry = entry.prev;

        size--;
        return tmp.data;
    }

    public void next(int s) {
        while (s >= 0) {
            entry = entry.next;
            s--;
        }
    }
    public void prev(int s) {
        while (s >= 0) {
            entry = entry.prev;
            s--;
        }
    }

    public T element() {
        return entry.data;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return entry == null;
    }
    public String toString() {
        String erg = "[";
        Node tmp = entry;
        int counter = size;
        while (counter > 1) {
            erg += tmp.data + ",";
            tmp = tmp.next;
            counter--;
        }
        return erg + tmp.data + "]";
    }
}
