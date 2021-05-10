package uebungsaufgaben.uebung00;

public class Helper {
    public static <T> void move(Buffer<T> source, Buffer<T> sink) {
        if (source.size() > sink.capacity() - sink.size()) {
            throw new IllegalArgumentException();
        }
        while (source.size() > 0) {
            sink.push(source.pop());
        }
    }
}
