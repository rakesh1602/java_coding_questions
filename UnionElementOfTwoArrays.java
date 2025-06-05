import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class UnionElementOfTwoArrays {

    public static int[] getUnionElementsOfTwoArrays(int[] array1, int[] array2){
        return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).distinct().toArray();
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,2,1};
        int[] array2 = new int[]{2,3};
        int[] unionElementsOfTwoArrays = getUnionElementsOfTwoArrays(array1, array2);
        System.out.println("unionElementsOfTwoArrays = " + Arrays.toString(unionElementsOfTwoArrays));
    }
}
