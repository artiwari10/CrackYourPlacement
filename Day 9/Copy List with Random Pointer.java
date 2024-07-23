/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
      if(head==null){
            return null;
        }
        Node newhead = new Node(head.val);
        if(head.next==null){
            Node newo = newhead;
            if(head.random==null){
                newhead.random=null;
            } else{
                newhead.random = newo;
            }
            return newhead;
        }
        Node temp2=newhead;
        Node temp=head.next;
        while(temp!=null){
            Node newone = new Node(temp.val);
            temp2.next=newone;
            temp2=temp2.next;
            temp=temp.next;
        }
        temp=head;
        temp2=newhead;
        while(temp!=null){
            Node og = head;
            Node copy = newhead;
            if(temp.random==null){
                temp2.random=null;
            } else{
                while(og!=temp.random && copy.next!=null){
                   og=og.next;
                   copy=copy.next;
                }
                temp2.random = copy;
            }
            temp2=temp2.next;
            temp=temp.next;
        }
        return newhead; 
    }
}