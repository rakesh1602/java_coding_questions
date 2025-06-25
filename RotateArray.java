import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {

    //d =2
    // [1,2,3,4,5]
    //since d = 4 rotate 4 time
    //[2,3,4,5,1] -> [3,4,5,1,2] -> [4,5,1,2,3] -> [5,1,2,3,4]

    // since d = 2
    // [2,3,4,5,1]->[3,4,5,1,2]
    // int[0]-> shift to n-1
    // int [1] -> shift to int[0]
    // int [2] -> shift to int[1]
    public static List<Integer> rotateArrayLeft(int d, List<Integer> arr) {
        List<Integer> rotated = new ArrayList<>();
        rotated.addAll(arr.subList(d,arr.size())); //[3,4,5]
        rotated.addAll(arr.subList(0,d)); //[1,2]
        return rotated;
    }

    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> rotateArray = rotateArrayLeft(4, arrayList);
        System.out.println("rotateArray = " + rotateArray);
    }
}
