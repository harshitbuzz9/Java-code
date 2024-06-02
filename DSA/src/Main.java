import linkedList.ListNode;
import linkedList.ListNodeUtils;
import linkedList.MergeKSortedList;

import java.util.Arrays;

public class Main {
    public static void main(String arg[]) {
        ListNode one = new ListNode(4);
        one.next = new ListNode(6);
        ListNode two = new ListNode(100);
        two.next = new ListNode(200);
        two.next.next = new ListNode(250);
        ListNode three = new ListNode(-10);
        three.next = new ListNode(20);
        three.next.next = new ListNode(1000);
        ListNodeUtils.printListNode(MergeKSortedList.mergeKSortedList(Arrays.asList(one, two, three)));
    }
}

