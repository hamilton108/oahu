package oahu.functional;

@FunctionalInterface
public interface Procedure2<T1,T2> {
    void apply(T1 v1, T2 v2);
}
