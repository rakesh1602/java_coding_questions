import java.util.Arrays;

public class FindFirstNonRepeatedCharacterInString {

    private static Character findFirstNonRepeatedChar(String s){
        return s.chars()
                .mapToObj(c -> (char) c)
                .filter(c-> s.indexOf(c) == s.lastIndexOf(c))
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        String s = "rrakesh";
        Character firstNonRepeatedChar = findFirstNonRepeatedChar(s);
        System.out.println("firstNonRepeatedChar = " + firstNonRepeatedChar);
    }
}
