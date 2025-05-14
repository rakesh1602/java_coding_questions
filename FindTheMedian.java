import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheMedian {

    //give array [0,1,2,3,4,5,6]
    //median is 3 --> 3 element before and 3 element after

    public static int findMedian(List<Integer> arr){
        Collections.sort(arr);
        int size = arr.size();
        System.out.println(size);
        int median = size/2;
        return arr.get(median);
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(0, 1, 2, 3, 4, 5, 6);
        System.out.println("Median: " + findMedian(arr));
    }
}
