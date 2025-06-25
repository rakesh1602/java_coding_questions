import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeFactor {

    //Write a program to print all prime factors of a given number
    //For example if we have the input number as 12, then the output will be 2,2,3

    public static List<Integer> getPrimeFactors(int num) {
        List<Integer> factors = new ArrayList<>();
        int n = num;

        //first get all 2s
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        //using intStream for odd factors
        final int[] finalN = {n};//final for lambda
        factors.addAll(IntStream.iterate(3, i -> i + 2)
                .limit((long) Math.sqrt(n) / 2 + 1)
                .boxed()
                .flatMap(i -> {
                    List<Integer> temp = new ArrayList<>();
                    while (finalN[0] % i == 0) {
                        temp.add(i);
                        finalN[0] /= i;
                    }
                    return temp.stream();
                })
                .collect(Collectors.toList()));

        if (finalN[0] > 2) {
            factors.add(finalN[0]);
        }
        return factors;
    }

    public static void main(String[] args) {
        int number = 12;
        List<Integer> primeFactors = getPrimeFactors(number);
        System.out.println("primeFactors of + " + number + " is" + primeFactors);
    }
}
