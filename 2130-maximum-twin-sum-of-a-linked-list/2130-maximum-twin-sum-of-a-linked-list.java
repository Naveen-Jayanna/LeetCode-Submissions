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
    public int pairSum(ListNode head) {
        ListNode first = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(first!=null){
            list.add(first.val);
            first = first.next;
            }
        int start = 0;
        int end = list.size()-1;
        int largest = -1;
        while(start<end){
            int value = list.get(start++)+list.get(end--);
            largest = value>largest ? value : largest;
        }
        return largest ;
    }
}