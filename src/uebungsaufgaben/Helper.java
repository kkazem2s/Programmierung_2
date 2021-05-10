package uebungsaufgaben;

public class Helper {
    public void move(IntegerBuffer source, IntegerBuffer sink) {
        try {
            while (source.capacity() > 0) {
                sink.push(source.pop());
            }
        } catch (Exception e) {
            throw new IndexOutOfBoundsException();
        }
    }
}
