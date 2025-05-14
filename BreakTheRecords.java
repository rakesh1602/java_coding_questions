import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores){
        int firstMax = scores.get(0);
        int firstMin = scores.get(0);

        int maxCount = 0;
        int minCount = 0;

        for(int i : scores){
            if(i > firstMax) {
                maxCount++;
                firstMax = i;
            } else if (i < firstMin) {
                minCount++;
                firstMin = i;
            }
        }
        List<Integer> outPut = new ArrayList<>();
        outPut.add(0,maxCount);
        outPut.add(1,minCount);
        return outPut;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(12,24,10,24);
        breakingRecords(arr);
    }
}
