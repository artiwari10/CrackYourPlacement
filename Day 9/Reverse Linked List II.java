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
    public ListNode reverseBetween(ListNode head, int left, int right) {
         if(head.next == null || left == right) {
            return head;
        }
        ListNode temp = new ListNode(0, head);
        ListNode leftNode = temp;
        for(int i = 0; i < left - 1; i++) {
            leftNode = leftNode.next;
        }
        ListNode newRight = leftNode.next;
        ListNode cur = newRight;
        ListNode prev = null;
        ListNode nextNode;
        while(left++ <= right) {
            nextNode = cur.next;
            cur.next = prev; 
            prev = cur;     
            cur = nextNode;
        }
        leftNode.next = prev;
        newRight.next = cur;
        return temp.next;
    }
}