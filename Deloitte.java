import java.util.stream.Collectors;

public class Deloitte {

    public static void main(String[] args) {
        String input = "missiii";
        String result = input.chars()
                .mapToObj(c->(char) c)
                .filter(c-> c!= 'i')
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("result = " + result);
    }
}
