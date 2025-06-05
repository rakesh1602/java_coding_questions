import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWordOccurrence {

    private static Map<String, Long> countOfWordOccurrence(List<String> stringList){
        return stringList.stream()
                .collect(Collectors.groupingBy(w->w, Collectors.counting()));
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("rakesh", "sdfhsjdfds", "sdfhsjdfds");
        Map<String, Long> countOfWordOccurrence = countOfWordOccurrence(strings);
        System.out.println("countOfWordOccurrence = " + countOfWordOccurrence);
    }
}
