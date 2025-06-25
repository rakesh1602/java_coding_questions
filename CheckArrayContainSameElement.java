import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckArrayContainSameElement {

    static boolean isContainSameElement(List<Integer> list1, List<Integer> list2) {
        List<Integer> l1 = new ArrayList<>(list1);
        List<Integer> l2 = new ArrayList<>(list2);
        Collections.sort(l1);
        Collections.sort(l2);
        return l1.equals(l2);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num); //record that we have seen this number !
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 4);
        List<Integer> list2 = Arrays.asList(1, 4, 3);
        boolean result = isContainSameElement(list1, list2);
        System.out.println(result);


        //containsDuplicate
        int[] nums = new int[]{1, 2, 3};
        boolean containsDuplicate = containsDuplicate(nums);
        System.out.println("containsDuplicate = " + containsDuplicate);
    }
}
