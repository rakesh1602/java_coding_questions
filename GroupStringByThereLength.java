import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringByThereLength {

    private static Map<Integer, List<String>> stringLength(List<String> stringList){
        return stringList.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("rakesh", "sdfhsjdfds", "suresh");
        Map<Integer, List<String>> integerListMap = stringLength(strings);
        System.out.println("integerListMap = " + integerListMap);

    }
}
