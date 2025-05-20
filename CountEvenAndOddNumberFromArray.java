import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEvenAndOddNumberFromArray {

    public static void findEventOddCount(List<Integer> arrays) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arrays.size(); i++) {
            if (arrays.get(i) % 2 == 0) {
                even++;
            } else if (arrays.get(i) % 2 != 0) {
                odd++;
            }
        }

        System.out.println("odd = " + odd);
        System.out.println("even = " + even);
    }

    public static void findOddEvenUsingJava8(List<Integer> integers) {
        long even = integers.stream().filter(integer -> integer % 2 == 0).count();
        long odd = integers.stream().filter(integer -> integer % 2 != 0).count();

        System.out.println("odd = " + odd);
        System.out.println("even = " + even);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 3, 4, 5, 2);
        findEventOddCount(integerList);
        findOddEvenUsingJava8(integerList);
    }
}
