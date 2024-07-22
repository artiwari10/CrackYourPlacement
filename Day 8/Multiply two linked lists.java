
class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        long ans=0;
        long num1=0,num2=0;
        
        while(first!=null) {
            num1 = (num1*10 + first.data)%1000000007;
            first=first.next;
        }
        while(second!=null) {
            num2 = (num2*10 + second.data)%1000000007;;
            second=second.next;
        }
        ans=(num1*num2)%1000000007;
        return ans%1000000007;
        
    }
}