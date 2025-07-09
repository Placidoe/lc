package move_window;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/10 上午1:13
 **/
public class 最小覆盖子串 {
    public String minWindow(String s, String t) {
        // s母 t目标
        if (s.length() < t.length()) {
            return "";
        }

        int[] targetCnt = new int[1000];
        for (int i = 0; i < t.length(); i++) {
            targetCnt[t.charAt(i)]++;
        }
        int start = 0;
        int len = Integer.MAX_VALUE;

        int[] sCnt = new int[1000];
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            sCnt[s.charAt(i)]++;
            while (check(sCnt, targetCnt)) {
                if (i - l + 1 < len) {
                    start = l;
                    len = i - l + 1;
                }
                sCnt[s.charAt(l++)]--;
            }
        }
        if (len == Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(start, start + len);
        }
    }

    public boolean check(int[] sCnt, int[] targetCnt) {
        for (int i = 0; i < targetCnt.length; i++) {
            if (sCnt[i] < targetCnt[i]) {
                return false;
            }
        }
        return true;
    }
}



