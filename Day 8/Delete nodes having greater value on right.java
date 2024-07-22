class Solution
{
    Node compute(Node head)
    {
        // your code here
       if(head.next == null) return head;
        Node curr = compute(head.next);
        if(head.data >= curr.data) {
            head.next = curr;
            return head;
        }
        return curr;
        
    }
}
  