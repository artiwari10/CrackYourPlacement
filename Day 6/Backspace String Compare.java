class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(int j =0;j<s.length();j++) {
            char i = s.charAt(j);
            if(i=='#') {
                if(!s1.isEmpty()) {
                    s1.pop();
                }
                
            }
            else s1.push(i);
        }
        for(int j =0;j<t.length();j++) {
            char i = t.charAt(j);
            if(i=='#') {
                if(!s2.isEmpty()) {
                    s2.pop();
                }
               
            }
            else s2.push(i);
        }
        if(s1.size() != s2.size()) {
            return false;

        }
        while(!s1.isEmpty()) {
            if(s1.pop() != s2.pop()) return false;
        }
        return true;
    }
}