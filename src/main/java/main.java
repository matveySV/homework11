import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int arr[] = {33, 45, -15, 0, -28, 77, -3, 15};
        System.out.println(Arrays.toString(arr));
        BabbleSort babbleSort = new BabbleSort();
        babbleSort.babbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("..............................");
        BinarySearch binarySearch = new BinarySearch();

        System.out.println(binarySearch.binarySearch(babbleSort.babbleSort(arr),-15 ));
    }
}
