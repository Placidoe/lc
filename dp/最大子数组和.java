package dp;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/9 上午12:55
 **/
public class 最大子数组和 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int res = Integer.MIN_VALUE ;
        int cur = 0;
        for(int i=0;i<nums.length;i++){
            cur = Math.max(cur+nums[i],nums[i]);
            res = Math.max(res,cur);
        }
        return res;
    }
}
