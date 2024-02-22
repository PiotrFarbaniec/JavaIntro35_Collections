package collections2_task5;

public class BubbleSorter {

    static<T extends Number> void sorter(T... values){
        if (values.length == 0 || values == null) {
            throw new RuntimeException("Wrong parameter provided (null or empty)");
        }
        for(int j=0; j < values.length; j++) {
            for (int i = 0; i < values.length - 1; i++) {
                if (values[i].doubleValue() > values[i+1].doubleValue()) {
                    T temp = values[i + 1];
                    values[i + 1] = values[i];
                    values[i] = temp;
                }
            }
        }
    }
}