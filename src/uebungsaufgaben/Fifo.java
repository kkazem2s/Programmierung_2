package uebungsaufgaben;

// First in First out
public class Fifo extends AbstractIntegerBuffer implements IntegerBuffer {

    public Fifo() {
        super();
    }

    public Fifo(int s) {
        super(s);
    }
    public Integer pop() {
        for (int i = 0; i < size; i++) {
            if (array[i] != null) {
                int x = array[i];
                array[i] = null;

                for (int j = 0; j < size-1; j++) {
                    array[j] = array[j+1];
                }

                return x;
            }
        }
        return null;
    }
}
