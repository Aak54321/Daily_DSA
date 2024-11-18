import java.util.*;
public class kthLargest {
   static List<Integer> kLargest(int arr[], int k) {
        // write code here
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int a : arr) {
            heap.add(a);
        }
        
        int i = 0;
        List<Integer> kElements = new ArrayList<>();
        while(i<k) {
            kElements.add(heap.poll());
            i++;
        }
            
        return kElements;
        
    } 
}
