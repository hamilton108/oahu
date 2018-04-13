package oahu.dto;

public class Tuple5<T1,T2,T3,T4,T5> {
    private final T1 t1;
    private final T2 t2;
    private final T3 t3;
    private final T4 t4;
    private final T5 t5;

    public Tuple5(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
    }
    public T1 item1() {
        return t1;
    }
    public T2 item2() {
        return t2;
    }
    public T3 item3() {
        return t3;
    }
    public T4 item4() {
        return t4;
    }
    public T5 item5() {
        return t5;
    }
}
