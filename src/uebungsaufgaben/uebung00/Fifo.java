package uebungsaufgaben.uebung00;

// First in First out
public class Fifo<T> extends AbstractBuffer<T>  {

    public Fifo() {
        super();
    }

    public Fifo(int capacity) {
        super(capacity);
    }

    public T pop() {
        T object = this.array[0];
        for(int i = 1; i < this.size(); i++) {
            this.array[i - 1] = this.array[i];
        }
        --this.size;
        return object;
    }
}
