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
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ListNode temp1=l1,temp2=l2;
        while(temp1 != null) {
            list1.add(temp1.val);
            temp1= temp1.next;
        }
        while(temp2 != null) {
            list2.add(temp2.val);
            temp2= temp2.next;
        }
        int i = list1.size()-1;
        int j = list2.size()-1;
        int carry =0;
        ListNode ans = null;
        while(i>=0 || j >=0) {
            ListNode curr = null;
            if(i>=0 && j>=0) {
                int sum = list1.get(i) + list2.get(j);
                if(carry > 0) {
                    sum++;
                    carry--;
                }
                if(sum>=10) {
                    carry++;
                    sum= sum%10;
                }
                curr = new ListNode(sum);
                i--;
                j--;
            }
            else if(i>=0) {
                int sum = list1.get(i);
                if(carry > 0) {
                    sum++;
                    carry--;
                }
                if(sum>=10) {
                    sum=sum%10;
                    carry++;
                }
                curr = new ListNode(sum);
                i--;
            }
            else {
                 int sum = list2.get(j);
                if(carry > 0) {
                    sum++;
                    carry--;
                }
                if(sum>=10) {
                    sum=sum%10;
                    carry++;
                }
                curr = new ListNode(sum);
                j--;
            }
            if(ans==null) {
                ans = curr;
            }
            else {
                curr.next = ans;
                ans = curr;
            }
        }
        if(carry > 0) {
            ListNode first = new ListNode(1);
            first.next = ans;
            ans = first;
        } 
        return ans;
        }

    }
