package greedy;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/29 上午12:32
 **/
public class 跳跃游戏 {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if(!dp[i]&&i!=0){
                break;
            }
            for(int j=i;j<=i+nums[i]&&j<nums.length;j++){
                dp[j] = true;
            }
        }
        return dp[nums.length-1];
    }
}
