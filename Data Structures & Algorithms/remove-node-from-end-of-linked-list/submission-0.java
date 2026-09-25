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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int count = 0;
        int length = 0;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        curr = head;
        ListNode prev = new ListNode(-1);
        prev.next = head;
        while(curr != null){
            if(length - n == count){
                prev.next = curr.next;
                break;
            }else{
                prev = curr;
                curr = curr.next;
                count++;
            }
        }
        return prev == null ? null : 
               (length == n ? prev.next : head);
    }
}
