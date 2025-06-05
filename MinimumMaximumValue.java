import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinimumMaximumValue {

    //We need to find Max and Min sum by removing one element
    //So to find max - we need to remove the smallest number
    //So to find min - we need to remove the largest number
    public static void minMaximumValue(List<Integer> arr) {
        Collections.sort(arr); //Sort the list // so now we have small no at[o] and large [length-1]

        long totalSum = arr.stream().mapToLong(Integer::longValue).sum(); // total sum of all the array
        long minSum = totalSum - arr.get(arr.size()-1); // Remove max element to get the min sum
        long maxSum = totalSum - arr.get(0); // Remove min element to get the max sum

        System.out.println(minSum + " " + maxSum);
    }

    private static Integer maximumValue(List<Integer> nums){
        return nums.stream()
                .max(Comparator.comparingInt(Integer::intValue))
                .orElse(0);
    }

    private static Integer minimumValue(List<Integer> nums){
        return nums.stream()
                .min(Comparator.comparingInt(Integer::intValue))
                .orElse(0);
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 3, 5, 7, 9,44,11);
        minMaximumValue(arr);

        Integer maximumValue = maximumValue(arr);
        System.out.println("maximumValue = " + maximumValue);

        Integer minimumValue = minimumValue(arr);
        System.out.println("minimumValue = " + minimumValue);
    }
}
