import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMap {
    public static Map<String, Integer> sortHashMap(Map<String, Integer> map) {
        return map.
                entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    public static void main(String[] args) {
        Map<String, Integer> unsorted = new HashMap<>();
        unsorted.put("apple", 3);
        unsorted.put("banana", 2);
        unsorted.put("cherry", 5);

        Map<String, Integer> sortedByValue = sortHashMap(unsorted);
        System.out.println("Sorted by value: " + sortedByValue);
    }
}
