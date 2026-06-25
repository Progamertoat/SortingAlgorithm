import Sort.BubbleSort;
import Sort.Sort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BubbleSortTest {

    @Test
    @DisplayName("Is a String Array sorted?")
    void sortStrings() {
        Sort<String> sort = new BubbleSort<>();
        String[] array = {"a" , "xy" , "ab" , "xa" , "aa" , "ba"};
        String[] sortedArray;
        sortedArray = sort.sort(array);
        assertThat(sortedArray).isSorted();
    }
    @Test
    @DisplayName("Is a Int Array sorted?")
    void sortInts() {
        Sort<Integer> sort = new BubbleSort<>();
        Integer[] array = {912,219,38,-213,0,321};
        Integer[] sortedArray = sort.sort(array);
        assertThat(sortedArray).isSorted();

    }
}