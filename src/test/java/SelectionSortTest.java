import Sort.SelectionSort;
import Sort.Sort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SelectionSortTest {

    @Test
    @DisplayName("Is a String Array sorted?")
    void sortStrings() {
        Sort<String> sort = new SelectionSort<String>();
        String[] array = {"a" , "xy" , "ab" , "xa" , "aa" , "ba"};
        String[] sortedArray;
        sortedArray = sort.sort(array);
        assertThat(sortedArray).isSorted();
    }
    @Test
    @DisplayName("Is a Int Array sorted?")
    void sortInts() {
        Sort<Integer> sort = new SelectionSort<Integer>();
        Integer[] array = {912,219,38,-213,0,321};
        Integer[] sortedArray = sort.sort(array);
        assertThat(sortedArray).isSorted();

    }
}