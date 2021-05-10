package uebungsaufgaben;

import java.util.Random;

public abstract class AbstractIntegerBuffer {
    protected int size = 0;
    protected Integer[] array;

    public AbstractIntegerBuffer() {
        Random ran = new Random();
        int x = ran.nextInt(98) + 3;
        array = new Integer[x];
        size = x;
    }

    public AbstractIntegerBuffer(int s) {
        array = new Integer[s];
        size = s;
    }

    public void push(Integer i){
        for(int j = 0; j < size; j++) {
            if (array[j] == null) {
                array[j] = i;
                break;
            }
        }
    }
    public int size() {
        for(int i = 0; i < size; i++) {
            if (array[i] == null) {
                return i;
            }
        }
        return size;
    }
    public int capacity() {
        return size;
    }
}
