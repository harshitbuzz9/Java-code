package linkedList;

public class ListNodeUtils {
    static ListNode head = null, tail = null;

    public static void printListNode(ListNode root) {
        do {
            System.out.print(root.data + ", ");
            root = root.next;
        } while (root != null);
    }

    public static ListNode insert(int data) {
        if (head == null) {
            head = new ListNode(data);
            tail = head;
        } else {
            tail.next = new ListNode(data);
            tail = tail.next;
        }
        return head;
    }
}
