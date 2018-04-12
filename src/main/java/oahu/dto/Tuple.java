package oahu.dto;

public class Tuple<T> {
    private final T _first;
    private final T _second;
    public Tuple(T first, T second) {
        this._first = first;
        this._second = second;
    }
    public T first() {
        return _first;
    }
    public T second() {
        return _second;
    }
}
