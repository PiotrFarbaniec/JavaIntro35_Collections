package collections2_task3;

public interface OwnList<E> {
    int size();
    boolean add(E e);
    E get (int index);
    boolean remove (E e);
}