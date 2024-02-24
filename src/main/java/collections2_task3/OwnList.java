package collections2_task3;

public interface OwnList<T> {
    int size();
    boolean add(T e);
    T get (int index);
    boolean remove (T e);
}