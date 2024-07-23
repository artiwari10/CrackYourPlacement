class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        gen(ans,"",0,0,n);
        return ans;
    }
     public static void gen(List<String> ans, String curr, int open, int close, int newLength) {
        if(curr.length() == 2*newLength) {
            ans.add(curr);
            return;
        }
        //System.out.println(curr);
        if(open<newLength)
            gen(ans,curr+"(",open+1,close,newLength);
        if(close<open)
            gen(ans,curr+")",open,close+1,newLength);
    }
}