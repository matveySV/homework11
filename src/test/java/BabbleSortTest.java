import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BabbleSortTest {
    @Test
    void shouldReturnSortedArray() {
        int array[] = {23,45,0,-28,-7,15, 21, -33};
        BabbleSort babbleSort = new BabbleSort();
        int[]result = babbleSort.babbleSort(array);
        assertThat(result).isSorted();
    }

    @Test
    void shouldReturnElementPositionByIndex(){
        int[] array = {0,1,3,6,8,10,14,19,25,33};
        int element = 3;
        int elementPosition = 2;
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.binarySearch(array,element);
        assertThat(result).isEqualTo(elementPosition);
    }
}