import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondSmallestElement {

    public static int secondSmallestElementOfArray(List<Integer> integerList) {
        int smallest = integerList.get(0);
        int secondSmallest = integerList.get(1);

        for (Integer integer : integerList) {
            if (integer < smallest) {
                secondSmallest = smallest;
                smallest = integer;

            } else if (integer < secondSmallest) {
                secondSmallest = integer;
            }
        }
        return secondSmallest;
    }

    public static int secondSmallestUsingJava8(List<Integer> integers) {
        return integers.stream().distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElseThrow();
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(12, 13, 11, 15, 14);
        int secondSmallestElementOfArray = secondSmallestElementOfArray(integerList);
        System.out.println("secondSmallestElementOfArray = " + secondSmallestElementOfArray);

        int secondSmallestUsingJava8 = secondSmallestUsingJava8(integerList);
        System.out.println("secondSmallestUsingJava8 = " + secondSmallestUsingJava8);
    }
}
