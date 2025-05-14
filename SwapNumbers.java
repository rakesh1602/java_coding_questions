import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping a is " + a + " b is " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping a is " + a + " b is " + b);

        List<Integer> nums = Arrays.asList(10, 20);
        Collections.swap(nums,0,1);

        System.out.println("a = " + nums.get(0) + ", b = " + nums.get(1));
    }
}
