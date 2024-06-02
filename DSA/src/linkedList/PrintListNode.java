package linkedList;

public class PrintListNode {
    public static void printListNode(ListNode root) {
        do {
            System.out.print(root.data + ", ");
            root = root.next;
        } while (root != null);
    }
}
