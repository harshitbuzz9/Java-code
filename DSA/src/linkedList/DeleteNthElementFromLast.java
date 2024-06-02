package linkedList;

public class DeleteNthElementFromLast {
    //n denotes : kth element from the last
    public static ListNode deleteNthElementFromLast(ListNode head, int n) {
        ListNode j = head, i = head;
        while (j != null && n-- > 0) {
            j = j.next;
        }
        if (j == null) {  // size of list == nth element
            return head.next;
        }
        while (j.next != null) {
            j = j.next;
            i = i.next;
        }
        i.next = i.next.next;
        return head;
    }
}
