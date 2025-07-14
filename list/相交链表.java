package list;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/15 上午12:47
 **/
public class 相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int lenA = 0, lenB = 0;

        while (curA != null) {
            lenA++;
            curA = curA.next;
        }
        while (curB != null) {
            lenB++;
            curB = curB.next;
        }

        int subLen = Math.abs(lenA - lenB);
        if (lenA > lenB) {
            for (int i = 0; i < subLen; i++) {
                headA = headA.next;
            }
        } else {
            for (int i = 0; i < subLen; i++) {
                headB = headB.next;
            }
        }

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
