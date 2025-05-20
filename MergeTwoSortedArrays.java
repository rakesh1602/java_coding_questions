import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoSortedArrays {

    public static int[] mergeSortedArrays(int[] list1, int[] list2) {
        return IntStream.concat(Arrays.stream(list1), Arrays.stream(list2)).sorted().toArray();
    }

    public static void main(String[] args) {
        int[] list1 = new int[]{1, 3, 5};
        int[] list2 = new int[]{2, 4, 6};
        int[] mergeSortedArrays = mergeSortedArrays(list1, list2);
        System.out.println("mergeSortedArrays = " + Arrays.toString(mergeSortedArrays));
    }
}
