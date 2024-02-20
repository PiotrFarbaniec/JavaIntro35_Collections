import java.util.Arrays;

public class MyList implements OwnList {
    private static final int DEFAULT_SIZE = 10;
    private Integer[] arrayElement;
    private int size;
    private int capacity;


    public MyList() {
        this.size = 0;
        this.capacity = DEFAULT_SIZE;
        this.arrayElement = new Integer[capacity];
    }

    public MyList (int initSize) {
        if(initSize < 0) {
            throw new IllegalArgumentException("Invalid value provided: " + initSize);
        } else if ( initSize >= 0 && initSize <= DEFAULT_SIZE) {
            this.size = 0;
            this.capacity = DEFAULT_SIZE;
            this.arrayElement = new Integer[capacity];

        } else if (initSize > DEFAULT_SIZE) {
            this.size = 0;
            this.capacity = initSize;
            this.arrayElement = new Integer[capacity];
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Integer get(int i) {
        if(i < 0 || i > size) {
            throw new IllegalArgumentException("There's no such index: " + i);
        }
        return arrayElement[i];
    }

    @Override
    public Integer remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Wrong index: " + index + ", out of actual size: " + size);
        }
        Integer removed = this.arrayElement[index];
        this.arrayElement[index] = null;
        arrayReindex(index);
        return removed;
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
    public void add(Integer element) {
        if (this.size == capacity) {
            extendSize();
        }
        arrayElement[size] = element;
        size++;
    }

    @Override
    public void add(int index, Integer element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Wrong index: " + index + ", out of actual size: " + size);
        }
        else if (this.size == this.capacity) {
            extendSize();
        }
        for (int i = size - 1; i >= index; i--) {
            arrayElement[i + 1] = arrayElement[i];
        }
        arrayElement[index] = element;
        size++;
    }

    private void extendSize() {
        this.capacity = arrayElement.length * 2;
        Integer[] arrayCopy = new Integer[capacity];
        System.arraycopy(this.arrayElement, 0, arrayCopy, 0, this.size);
        arrayElement = arrayCopy;
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayElement);
    }
}