import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharacters {

    public static void findDuplicateCharacters(String str){
        Map<Character,Long> duplicates = str.chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("Duplicate Chars: ");
        duplicates.entrySet().stream()
                .filter(characterLongEntry -> characterLongEntry.getValue()>1)
                .forEach(characterLongEntry -> System.out.println(characterLongEntry.getKey()+ " "+characterLongEntry.getValue()));

    }

    public static void main(String[] args) {
        String s = "programming";
        findDuplicateCharacters(s);
    }
}
