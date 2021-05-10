package uebungsaufgaben.uebung00;

public class Helper {
    public void move(Buffer source, Buffer sink) {
        try {
            while (source.capacity() > 0) {
                sink.push(source.pop());
            }
        } catch (Exception e) {
            throw new IndexOutOfBoundsException();
        }
    }
}
