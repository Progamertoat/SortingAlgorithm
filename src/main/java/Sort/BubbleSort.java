package Sort;

public class BubbleSort  <T extends Comparable> implements Sort<T>{
    @Override
    public T[] sort(T[] original) {

        T[] array = original.clone();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                T value = array[j];
                if (value.compareTo(array[j + 1]) > 0 ) {
                    array[j] = array[j+1];
                    array[j+1] = value;
                }
            }
        }
        return array;
    }
}
