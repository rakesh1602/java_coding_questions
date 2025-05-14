import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestNumberInArray {

    public static int largestNumberInArray(List<Integer> integerList) {
        return integerList.stream().max(Integer::compareTo).get();
    }

    public static int secondHighestNumber(List<Integer> integers) {
        return integers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder()) //sort in descending order
                .skip(1)
                .findFirst()
                .orElseThrow();
    }

    public static int highestNumberUsingTrad(List<Integer> integers) {
        int highest = integers.get(0);
        for (int i : integers) {
            if (i > highest) {
                highest = i;
            }
        }
        return highest;
    }

    public static int secondHighestUsingTrad(List<Integer> integerList) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : integerList) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }
        }
        return secondHighest;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 5, 11);

        int largestNumber = largestNumberInArray(list);
        System.out.println("largestNumber = " + largestNumber);

        int largetsNumberUsingTrad = highestNumberUsingTrad(list);
        System.out.println("largetsNumberUsingTrad = " + largetsNumberUsingTrad);

        int secondHighestNumber = secondHighestNumber(list);
        System.out.println("secondHighestNumber = " + secondHighestNumber);

        int secondHighestUsingTrad = secondHighestUsingTrad(list);
        System.out.println("secondHighestUsingTrad = " + secondHighestUsingTrad);
    }
}
