import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {

    private static List<String> upperCase(List<String> strings){
        return strings.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("rakesh", "ramesh", "suresh");
        List<String> upperCase = upperCase(strings);
        System.out.println("upperCase = " + upperCase);
    }
}
