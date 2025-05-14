import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctCharacterAndThereCount {

    static Map<Character, Long> distinctCharAndLength(String string) {
       return string.chars() // this convert string to no i.e a->97
               .mapToObj(c->(char)c) //this convert back to char
               .collect(Collectors.groupingBy(
                       Function.identity(),
                       Collectors.counting()
               ));
    }

    public static void main(String[] args) {
        Map<Character, Long> bakabaka = distinctCharAndLength("bakabaka");
        System.out.println("bakabaka = " + bakabaka);
    }
}
