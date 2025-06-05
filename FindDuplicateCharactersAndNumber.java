import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharactersAndNumber {

    public static void findDuplicateCharacters(String str) {
        Map<Character, Long> duplicates = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Duplicate Chars: ");
        duplicates.entrySet().stream()
                .filter(characterLongEntry -> characterLongEntry.getValue() > 1)
                .forEach(characterLongEntry -> System.out.println(characterLongEntry.getKey() + " " + characterLongEntry.getValue()));

    }

    public static int findDuplicateNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "programming";
        int[] nums = new int[]{1, 2, 4, 2};
        findDuplicateCharacters(s);

        int duplicateNumber = findDuplicateNumber(nums);
        System.out.println("duplicateNumber = " + duplicateNumber);
    }
}
