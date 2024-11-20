public class jumpGametwo {
    public int jump(int[] nums) {
        int l = 0, r = 0, farthest = 0, jumps = 0;
        while (r < nums.length - 1) {
            for (int i = l; i <= r; i++) {
                farthest = Math.max(nums[i] + i, farthest);
            }
            l = r + 1;
            r = farthest;
            jumps++;
        }
        return jumps;
    }

}