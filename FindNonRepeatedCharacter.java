import java.util.List;

public class FindNonRepeatedCharacter {

    private static Character findNonRepeatCharacter(String s){
        return s.chars()
                .mapToObj(c-> (char)c)
                .filter(character -> s.indexOf(character) == s.lastIndexOf(character))
                .findFirst().orElse(null);
    }
}
