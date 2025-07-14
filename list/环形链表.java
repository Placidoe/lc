package list;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/15 上午12:53
 **/
public class 环形链表 {
    public boolean hasCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s) {
                return true;
            }
        }
        return false;
    }
}
