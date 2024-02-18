package collections2_task5;

public class BubbleSorter {

    static<T extends Number> void bubbleSorter(T... values){
        for(int j=0; j < values.length; j++) {
            for (int i = 0; i < values.length - 1; i++) {
                if ((Double) values[i] > (Double) values[i + 1]) {
                    T temp = values[i + 1];
                    values[i + 1] = values[i];
                    values[i] = temp;
                }
            }
        }
    }
}