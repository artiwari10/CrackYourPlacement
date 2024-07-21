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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=null,tail=null;
        int v1=0,v2=0,carry=0,add=0,sum=0;
        while(l1!=null && l2!=null)
        {v1=l1.val;
        v2=l2.val;
         l1=l1.next;   
         l2=l2.next;
         sum=v1+v2;
        if(carry==1)
        {sum+=1;
        carry=0;}
         if(sum > 9)
            {add=sum%10;
            carry=1;}
         else
             add=sum;
        ListNode curr = new ListNode(add);
         if(head == null)
         {head=curr;
         tail=curr;}
         else
         {
         tail.next=curr;
         tail=tail.next;
        }
        }
        while(l1!=null)
        {  
            int temp=l1.val+carry;
            carry=0;
            if(temp>9)
            {
                temp=temp%10;
                carry=1;
            }
            ListNode curr = new ListNode(temp);
            tail.next=curr;
         tail=tail.next;
        l1=l1.next;
        }
        
        
        
        while(l2!=null)
        {  
            int temp=l2.val+carry;
            carry=0;
            if(temp>9)
            {
                temp=temp%10;
                carry=1;
            }
            ListNode curr = new ListNode(temp);
            
         tail.next=curr;
         tail=tail.next;
        l2=l2.next;
        }
        if(carry > 0)
        {
            ListNode curr = new ListNode(1);
            tail.next=curr;
            tail=tail.next;
        }
        return head;
    }
}