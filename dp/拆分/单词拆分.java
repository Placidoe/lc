package dp.拆分;

import java.util.List;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/8/7 上午12:51
 **/
public class 单词拆分 {//左闭右开

    //大状态划分
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i=0;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
