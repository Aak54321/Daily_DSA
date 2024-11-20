import java.util.*;
public class threeSumClosest {
    public int threeSumClose(int[] nums, int target) {
        Arrays.sort(nums);
        int closum = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length-2;i++) {
            int j = i + 1, k = nums.length -1;

            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(sum-target) < Math.abs(closum-target)) {
                    closum = sum;
                } else if(sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return closum;
    }
}
