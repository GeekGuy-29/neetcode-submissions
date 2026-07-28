/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> pq =
            new PriorityQueue<>(
                (a,b)->Integer.compare(a.val,b.val)
            );


        for(ListNode list : lists)
        {   
            if(list != null)
                pq.offer(list);
        }

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while(!pq.isEmpty())
        {
            ListNode current = pq.poll();

            tail.next = current;
            tail = tail.next;

            if(current.next != null)
                pq.offer(current.next);
        }
        return dummy.next;
    }
}
