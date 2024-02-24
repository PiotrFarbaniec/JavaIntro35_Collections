package collections2_task3;

import java.util.Arrays;

public class MyList<T> implements OwnList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] arrayElement;
    private int size;
    private int capacity;

    public MyList() {
        this.size = 0;
        this.capacity = DEFAULT_SIZE;
        this.arrayElement = new Object[capacity];
    }

    public MyList(int initSize) {
        if (initSize < 0) {
            throw new IllegalArgumentException("Invalid value provided: " + initSize);
        } else if (initSize >= 0 && initSize <= DEFAULT_SIZE) {
            this.size = 0;
            this.capacity = DEFAULT_SIZE;
            this.arrayElement = new Object[capacity];

        } else if (initSize > DEFAULT_SIZE) {
            this.size = 0;
            this.capacity = initSize;
            this.arrayElement = new Object[capacity];
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(T e) {
        if (this.size == capacity) {
            extendSize();
        }
        arrayElement[size] = e;
        size++;
        return true;
    }

    private void extendSize() {
        this.capacity = arrayElement.length * 2;
        Object[] arrayCopy = new Object[capacity];
        System.arraycopy(this.arrayElement, 0, arrayCopy, 0, this.size);
        arrayElement = arrayCopy;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("There's no such index: " + index);
        }
        return (T) arrayElement[index];
    }

    @Override
    public boolean remove(T e) {
        if (e == null) {
            throw new IllegalArgumentException("Wrong parameter: " + e + ", there's no such object");
        }
        for (int i = 0; i < size; i++) {
            boolean isContain = false;
            if (arrayElement[i].hashCode() == e.hashCode()) {
                arrayElement[i] = null;
                arrayReindex(i);
                isContain = true;
            }
            if (isContain) return true;
        }
        return false;
    }

    private void arrayReindex(int index) {
        int from = index + 1;
        for (int i = 0; i < size - from; i++) {
            arrayElement[index + i] = arrayElement[from + i];
        }
        this.size--;
        arrayElement[size] = null;
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayElement);
    }
}