import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LonelyElement {

    //return the unique element
    //a=[1,2,2,3,4,3,2,1]

    public static int lonelyinteger(List<Integer> a){
       return a.stream()
               .filter(num -> Collections.frequency(a,num)==1)
               .findFirst()
               .orElse(-1);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,3,2,1);
        lonelyinteger(integers);
    }
}
