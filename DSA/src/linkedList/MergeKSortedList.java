package linkedList;

import java.util.*;

public class MergeKSortedList {
    static void reConfig(PriorityQueue<Integer> pq, List<ListNode> listNodes, int tar) {
        int i = 0, size = listNodes.size();
        while (i < size) {
            if (listNodes.get(i).data == tar) {
                if (listNodes.get(i).next != null) {
                    listNodes.set(i, listNodes.get(i).next);
                    pq.add(listNodes.get(i).data);
                } else {
                    listNodes.remove(listNodes.get(i).next);
                }
                return;
            }
            i++;
        }
    }

    public static ListNode mergeKSortedList(List<ListNode> listNodes) {
        ListNode merged = null;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        listNodes.forEach(a -> {
            pq.add(a.data);
        });
        while (!(pq.isEmpty())) {
            Integer poll = pq.poll();
            merged = ListNodeUtils.insert(poll);
            reConfig(pq, listNodes, poll);
        }
        return merged;
    }
}
