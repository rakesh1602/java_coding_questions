package javabasics;

import java.io.PrintStream;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            System.out.println("Try block started");
//            String name = null;
//            System.out.println(name.length());

            int[] arr = {1, 2, 3};
            System.out.println(arr[2]);

            int divider = 0;

            if (divider != 0) {
                int div = arr[1] / divider;
                System.out.println(div);
            } else throw new CustomException("Divider zero found");
            System.out.println("Try block ended");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("arithmeticException = " + arithmeticException);
            throw new ArithmeticException(arithmeticException.getMessage());
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("arrayIndexOutOfBoundsException = " + arrayIndexOutOfBoundsException);
            throw new ArrayIndexOutOfBoundsException(arrayIndexOutOfBoundsException.getMessage());
        } catch (CustomException exception) {
            System.out.println("Custom exception occurred = " + exception.getMessage());
            throw new CustomException(exception.getMessage());
        } catch (RuntimeException exception) {
            System.out.println("exception = " + exception);
            throw new RuntimeException(exception.getMessage());
        }
    }
}
