import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToEnd {

    public static void moveZeroesToEnd(List<Integer> integerList) {
        int index = 0; //initial index

        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) != 0) {
                integerList.set(index++, integerList.get(i)); //first set non zero element at index
            }
        }

        for (int i = index; i < integerList.size(); i++) { //for i = index
            integerList.set(i, 0); // now set zero element at end
        }

        System.out.println(integerList);

    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(0, 1, 22, 0, 46, 4, 0));
        moveZeroesToEnd(integerList);
    }
}
