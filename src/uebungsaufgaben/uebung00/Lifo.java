package uebungsaufgaben.uebung00;

// Last in First out
public class Lifo<T> extends AbstractBuffer<T> implements Buffer<T> {

    public Lifo() {
        super();
    }

    public Lifo(int capacity){
        super(capacity);
    }

    public void push(T i){
        if (size() == capacity()){
            throw new IndexOutOfBoundsException();
        }
        array[size] = i;
        size++;
    }

    public T pop(){
        if (size == 0) {
            throw new IndexOutOfBoundsException();
        }
        return (T) array[--size];
    }
}
