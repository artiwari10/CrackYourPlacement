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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = null,tail=null;
        int val=0;
    while(head != null) {
           ListNode current = new ListNode(head.val);
        if(result == null) {
            result = current; 
            tail = current;
        }
     else{
         if(val == head.val){ 
            head=head.next;  
         continue;
         }
         else {
             tail.next=current;
             tail=tail.next;
         }
     }
     val=head.val;
     head=head.next;
    }
    return result;
    }
}