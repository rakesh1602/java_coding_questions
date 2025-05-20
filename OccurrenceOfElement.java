import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfElement {

    public static void findOccurrenceOfElement(List<Integer> integers) {
        Map<Integer, Long> occurrences = integers.
                stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        occurrences.forEach((k, v) -> System.out.println("k = " + k + " " + "occurred " + v));
    }

    public static long findOccurrenceOfElement(List<Integer> integers, Integer targetElement) {
        return integers.
                stream()
                .filter(integer -> integer.equals(targetElement))
                .count();
    }

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 3, 4, 1, 2, 4, 2, 2);
        findOccurrenceOfElement(array);
        long occurrenceOfElement = findOccurrenceOfElement(array, 4);
        System.out.println("occurrenceOfElement = " + occurrenceOfElement);

    }
}
