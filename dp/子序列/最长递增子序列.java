package dp.子序列;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/8/7 上午12:37
 **/
public class 最长递增子序列 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int res = 1 ;
        for(int i=0;i<nums.length;i++){
            dp[i] = 1;
        }
        //[i,j]
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    dp[j] = Math.max(dp[j],dp[i]+1);
                    res = Math.max(res,dp[j]);
                }
            }
        }
        return res;
    }
}
