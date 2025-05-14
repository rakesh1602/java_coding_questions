import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Nice {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex", "rakesh", "John");

        String searchString = "rakesh";
        Optional<String> result = names.stream()
                .filter(name->name.equals(searchString))
                .findFirst();

        result.ifPresentOrElse(name-> System.out.println("name found : " + name),
                ()-> System.out.println("name not found"));
    }
    }
