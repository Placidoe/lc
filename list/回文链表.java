package list;

import java.util.LinkedList;
import java.util.List;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/21 下午10:34
 **/
public class 回文链表 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        int len = 0;
        int[] dp = new int[100010];
        ListNode cur = head;
        while (cur != null) {
            dp[len++] = cur.val;
            cur = cur.next;
        }

        return check(dp, 0, len - 1);
    }

    public boolean check(int[] dp, int l, int r) {
        while (l < r) {
            if (dp[l] != dp[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
