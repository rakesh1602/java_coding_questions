import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

    private static List<Integer> evenNumber(List<Integer> nums){
        return nums.stream().filter(n-> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        List<Integer> evenNumber = evenNumber(nums);
        System.out.println("evenNumber = " + evenNumber);
    }
}
