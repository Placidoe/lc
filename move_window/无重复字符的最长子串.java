package move_window;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/5 下午6:42
 **/
public class 无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        int[] cnt = new int[1000];
        int res = 0 ;
        for(int l=0,r=0;r<s.length();r++){
            cnt[s.charAt(r)]++;
            while(cnt[s.charAt(r)]>1){
                cnt[s.charAt(l++)]--;
            }
            res = Math.max(res,r-l+1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new 无重复字符的最长子串().lengthOfLongestSubstring("abcabcbb"));;
    }
}
