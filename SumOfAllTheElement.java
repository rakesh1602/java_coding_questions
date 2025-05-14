import java.util.Arrays;
import java.util.List;

public class SumOfAllTheElement {

    static int sumOfAllTheElement(List<Integer> integers){
        return integers.stream().mapToInt(Integer::intValue).sum();
    }

    static int sumOfAllElementUsingTrad(List<Integer> integers){
        int sum=0;
        for (int i=0;i<=integers.size();i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,4,5);
        int sum1 =sumOfAllTheElement(integers);
        System.out.println("sum1 = " + sum1);
        int sum2 =sumOfAllElementUsingTrad(integers);
        System.out.println("sum2 = " + sum2);

    }
}
