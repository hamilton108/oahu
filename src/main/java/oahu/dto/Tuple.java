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

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof Tuple)) {
            return false;
        }
        Tuple ot = (Tuple)o;
        if (!_first.equals(ot.first())) {
            return false;
        }
        return _second.equals(ot.second());
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (_first != null) {
            result = 31 * result + _first.hashCode();
        }
        if (_second != null) {
            result = 31 * result + _second.hashCode();
        }
        return result;
    }
}
