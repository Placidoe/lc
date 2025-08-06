package greedy;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/29 上午12:26
 **/
public class 买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1){
            return 0;
        }
        int[] dp = new int[prices.length];
        int min = prices[0];
        int res = 0 ;
        for(int i=0;i<prices.length;i++){
            int cur = prices[i] - min;
            min = Math.min(min,prices[i]);
            res = Math.max(res,cur);
        }
        return res;
    }
}
