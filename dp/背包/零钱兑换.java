package dp.背包;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/8/7 上午12:13
 **/
public class 零钱兑换 {
    //完全背包

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        //1.初始化
        for(int i=0;i<=amount;i++){
            dp[i] = Integer.MAX_VALUE/2;
        }
        dp[0] = 0;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=amount;j++){
                if(dp[j-coins[i]]!=Integer.MAX_VALUE/2){
                    dp[j] = Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
        }
        if(dp[amount]==Integer.MAX_VALUE/2){
            return -1;
        }
        return dp[amount];
    }
}
