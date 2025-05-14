import java.util.ArrayList;
import java.util.List;

public class SpareArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries){
        //given
        //string = ['ab','ab','abc']
        //queries = ['ab','abc','bc']
        // for each queries find how much time it repeated in string
        // ab is 2 time // abc is 1 time //bc is 0 time
        //so return [2,1,0]

        List<Integer> result = new ArrayList<>();
        int stringLength= strings.size();
        int queriesLength = queries.size();
        int count = 0;
        for(int i=0;i<queriesLength;i++){
            for(int j=0; j<stringLength; j++){
                if(queries.get(i).equals(strings.get(j))){
                    count++;
                }
            }
            result.add(count);
        }
        return result;
    }
}
