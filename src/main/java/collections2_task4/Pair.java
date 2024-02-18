package collections2_task4;

public class Pair<K,V> {
    private K firstValue;
    private V secondValue;

    public Pair(K firstValue, V secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public K getFirstValue() {
        return firstValue;
    }

    public V getSecondValue() {
        return secondValue;
    }
}