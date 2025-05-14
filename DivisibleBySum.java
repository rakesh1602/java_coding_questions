import java.util.Arrays;
import java.util.List;

public class DivisibleBySum {

    public static int divisibleSumPairs(int n, int k, List<Integer> arr) {
        //For the given array : [1,2,3,4,5,6]
        //For given number  k = 5
        //Find out the pairs from array, where sum of two is divisible by 5 arr % k == 0
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if ((arr.get(i) + arr.get(j)) % k == 0) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6);
        divisibleSumPairs(5, 5, arr);
    }
}
