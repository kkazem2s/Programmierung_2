package uebungsaufgaben;

// Last in First out
public class Lifo extends AbstractIntegerBuffer implements IntegerBuffer {

    public Lifo() {
        super();
    }

    public Lifo(int s){
        super(s);
    }

    public Integer pop() {
        Integer x = null;
        for (int i = size-1; i >= 0; i--) {
            if (array[i] != null) {
                x = array[i];
                array[i] = null;
                return x;
            }
        }
        return x;
    }
}
