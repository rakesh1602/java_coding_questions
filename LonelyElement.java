import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LonelyElement {

    //return the unique element
    //a=[1,2,2,3,4,3,2,1]

    public static List<Integer> lonelyInteger(List<Integer> a) {
        return a.stream()
                .filter(num -> Collections.frequency(a, num) == 1)
                .collect(Collectors.toList())
                ;
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 3, 2, 1, 5);
        List<Integer> lonelyInteger = lonelyInteger(integers);
        System.out.println("lonelyInteger = " + lonelyInteger);
    }
}

