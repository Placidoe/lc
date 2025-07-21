package list;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/21 下午10:30
 **/
public class 反转链表 {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
