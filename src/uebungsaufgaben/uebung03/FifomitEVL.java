package uebungsaufgaben.uebung03;

public class FifomitEVL<T> implements FifoIF<T> {
    private final EVL<T> fifo;

    public FifomitEVL() {
        fifo = new EVL<>();
    }

    @Override
    public void push(T e) {
        fifo.addFirst(e);
    }

    @Override
    public T pop() {
        return fifo.removeLast();
    }

    @Override
    public T peek() {
        T data = fifo.removeLast();
        fifo.addLast(data);
        return data;
    }

    @Override
    public int size() {
        return fifo.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
