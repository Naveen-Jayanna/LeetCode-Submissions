/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev = node;
        node = node.next;
        while(true){
            prev.val = node.val;
            if(node.next == null){
                prev.next = null;
                break;
            }
            prev = node;
            node = node.next;
        }
    }
}