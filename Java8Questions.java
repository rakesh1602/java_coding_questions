import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Questions {

    public static void returnName (List<String> names){
        List<String> upperCase = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(upperCase);

        //group by length
//        List<String> groupByLength = names.stream()
//                .collect(Collectors.groupingBy(String::length));
    }

    public static void evenNumbers(List<Integer> numbers){
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 ==0 )
                .collect(Collectors.toList());

        System.out.println(evenNumbers);
    }

    public static void maxValues(List<Integer> integerList){
        Integer maxValues = integerList.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println(maxValues);
    }

    public static void main(String[] args) {
            List<String> names = Arrays.asList("alice", "bob");
            List<Integer> numbers = Arrays.asList(2,4,3,1,8);
            returnName(names);
            evenNumbers(numbers);
    }
}
