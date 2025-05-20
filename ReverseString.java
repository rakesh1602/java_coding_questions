import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {

    public static String revereString(String str) {
        char[] chars = str.toCharArray(); // converting string to char arrays
        int left = 0, right = chars.length - 1;
        while (left < right) {
            //swapping
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
    }

    public static String reverse(String in) {
        if (in == null)
            throw new IllegalArgumentException("Null is not valid input");

        StringBuilder out = new StringBuilder();

        char[] chars = in.toCharArray();
        System.out.println(chars.length);

        for (int i = chars.length - 1; i >= 0; i--)
            out.append(chars[i]);

        return out.toString();
    }

    public static void reverseUsingJava8(String string) {
        String reversed = new StringBuilder(string).reverse().toString();
        System.out.println("reversed = " + reversed);
    }

    public static void reverseAgain(String string) {
        char[] in = string.toCharArray();
        StringBuilder out = new StringBuilder();
        for (int i = in.length - 1; i >= 0; i--) {
            out.append(in[i]);
            System.out.println(out.toString());
        }
    }

    public static void reverseNumber(Integer integer) {
        char[] input = integer.toString().toCharArray();
        StringBuilder out = new StringBuilder();
        for (int i = input.length - 1; i >= 0; i--) {
            out.append(input[i]);
            System.out.println(out);
        }

        //using java8
        String reversed = new StringBuilder(
                String.valueOf(integer)
                        .chars()
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining())
        ).reverse().toString();

        System.out.println("Reversed number using java8 " + reversed);
    }

    public static void reverseArray(int[] arrayInts) {
        for (int i = arrayInts.length - 1; i >= 0; i--) {
            System.out.print(arrayInts[i] + " ");
        }
    }


    public static void main(String[] args) {
        String input = "nice";
        String reversed = revereString(input);
        String reverse = reverse("sindoor");
        reverseUsingJava8("rakesh");
        System.out.println("Reversed string : " + reversed);
        reverse(reverse);
        System.out.println(reverse);
        reverseAgain("tcs");
        reverseNumber(1234);


        int arr[] = {1, 2, 3, 4, 5};
        reverseArray(arr);
    }
}


//SELECT DISTINCT salary FROM employess ORDER BY DESC LIMIT 1

//SELECT MAX(salary) FROM employess WHERE salary < (SELECT MAX(salary) FROM employees);
