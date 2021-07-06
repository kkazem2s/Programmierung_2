package probeklausur_210705;

import java.util.NoSuchElementException;
import java.util.Random;

@SuppressWarnings("unchecked")
public class Arche<T>{
    // private Variablen für das Array von Tieren, sowie die aktuell belegten Plätze des Array
    private T[] array;
    private int size;

    // Konstruktor zur Instanziierung
    public Arche() {
        size = 0;
        array = (T[]) new Object[1];
    }

    /* Fügt t der Arche hinzu. Falls die Arche voll ist wird die Feldgröße verdoppelt
       Rückgabewert ist die aktuelle maximale Kapazität der Arche */
    public int insert(T t) {
        check();
        T[] array = (T[]) new Object[this.array.length];
        for (int i = 1; i < array.length; i++) {
            array[i] = this.array[i-1];
        }
        array[0] = t;
        size++;
        this.array = array;
        return this.array.length;
    }

    /* Entfernt ein beliebiges Tier aus der Arche. Falls die Arche nur noch zu 1/4 gefüllt
       ist wird die Feldgröße halbiert Falls aus einer leeren Arche ein Tier entfernt werden soll, soll eine
       ’NoSuchElementException’ geworfern werden
     */
    public T remove() throws NoSuchElementException {
        if (size == 0) {
            throw new NoSuchElementException();
        } else {
            T[] dynArray = (T[]) new Object[this.array.length];
            T tmp = this.array[0];
            for(int i = 1; i < dynArray.length; i++) {
                dynArray[i-1] = this.array[i];
            }
            this.array = dynArray;
            size--;
            check();
            return tmp;
        }
    }

    public int getSize() {
        return size;
    }
    public int getArraySize() {
        return array.length;
    }

    private void check() {
        if (size == array.length) {
            doubleSize();
        } else {
            if ((size-1)*4 == array.length || size == 1) {
                halfSize();
            }
        }
    }
    private void doubleSize() {
        T[] dynArray = (T[]) new Object[this.array.length*2];
        for (int i = 0; i < this.array.length; i++) {
            dynArray[i] = this.array[i];
        }
        this.array = dynArray;
    }
    private void halfSize() {
        T[] dynArray = (T[]) new Object[this.array.length/2];
        for (int i = 0; i < dynArray.length; i++) {
            dynArray[i] = this.array[i];
        }
        this.array = dynArray;
    }
}
/**
 * @author kkazem2s - 9031334
 */