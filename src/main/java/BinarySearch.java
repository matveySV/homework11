public class BinarySearch {

    public int binarySearch(int[] array, int element) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] == element) {
                return middleIndex;
            } else if (array[middleIndex] < element) {
                firstIndex = middleIndex + 1;
            } else if (array[middleIndex] > element) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}