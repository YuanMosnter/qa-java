package genericType;

public class Pair<T extends Number>{

    private T first;
    private T last ;

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public Pair() {
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getLast() {
        return last;
    }

    public void setLast(T last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }

    public static <K extends Number>Pair<K> create(K first, K last) {
        return new Pair<K>(first, last);
    }
}
