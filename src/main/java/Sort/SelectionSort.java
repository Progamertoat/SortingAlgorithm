package Sort;

public class  SelectionSort <T extends Comparable> implements Sort<T>{
    @Override
    public T[] sort(T[] original) {
        T[] array = original.clone();
        T min = null;
        for (int i = 0; i < array.length; i++) {
            int j = i;
            min = array[i];
            int k = i;
            for (; j < array.length; j++) {
                if (min.compareTo(array[j]) > 0) {
                    min = array[j];
                    k = j;
                }
            }
            array[k] = array[i];
            array[i] = min;
        }
        return array;
    }


}
