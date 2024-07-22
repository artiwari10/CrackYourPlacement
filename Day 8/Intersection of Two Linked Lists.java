/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         if(headA == null || headB == null) return null;
        ListNode temp1=headA;
        ListNode temp2=headB;
        int l1=0,l2=0;
        while(temp1!=null) {
            l1++;
            temp1=temp1.next;
        }
        while(temp2!=null) {
            l2++;
            temp2=temp2.next;
        }
        temp1=headA;
        temp2=headB;
        int count=0;
        if(l1>l2) {
            count=l1-l2;
            while(count>0) {
                temp1=temp1.next;
                count--;
            }
        } 
        else{
            count=l2-l1;
            while(count>0){
                temp2=temp2.next;
                count--;
            }
        }
        while(temp1!=null&&temp2!=null){
            if(temp1==temp2) return temp1;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }
}