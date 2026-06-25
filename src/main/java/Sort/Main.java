import Sort.SelectionSort;
import Sort.Sort;

void main() {
    Integer[] array = {2,31,63,-212,32,1};
    Sort<Integer> selectionSort = new SelectionSort<>();
    Integer[] sortedArray = {3 , 2, 3};
    selectionSort.sort(array);


}
