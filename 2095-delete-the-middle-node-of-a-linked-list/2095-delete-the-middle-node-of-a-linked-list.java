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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
            return null;
        ListNode prev = head, next = head.next;
        while(next != null && next.next != null){
            next = next.next.next;
            if(next != null)
                prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}