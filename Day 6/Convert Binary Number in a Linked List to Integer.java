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
    public int getDecimalValue(ListNode head) {
        if(head==null) return 0;
        int i =0;
        ListNode temp = head;
        while(temp.next!=null) {
            temp=temp.next;
            i++;
        }
       int ans =0;
       while(head!=null) {
        if(head.val != 0 ) {
            ans+= Math.pow(2,i);
        }
        head=head.next;
        i--;
       }
       return ans;

    }
}