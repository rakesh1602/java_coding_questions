import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachWord {

    private static Map<String, Long> frequencyOfEachWord(String string) {
        return Arrays.stream(string.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static void main(String[] args) {
        Map<String, Long> frequencyOfEachWord = frequencyOfEachWord("who i am you dont know who");
        System.out.println("frequencyOfEachWord = " + frequencyOfEachWord);
    }
}
