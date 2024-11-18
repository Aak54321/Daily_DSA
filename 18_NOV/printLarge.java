import java.util.*;
public class printLarge {
    String printLargest(int[] arr) {
        // code here
        String[] strArr = Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(strArr,(a,b)->(b+a).compareTo(a+b));
        
        StringBuilder str = new StringBuilder();
        for(int i=0;i<strArr.length;i++) {
            str.append(strArr[i]);
        }
        return str.toString();
    }
 
}
