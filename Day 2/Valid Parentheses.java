class Solution {
    public boolean isValid(String s) {
        Stack<Character> box = new Stack<>();
        int i =1;
        box.push(s.charAt(0));
        while(i<s.length()) {
            if(s.charAt(i)=='}') {
                if(box.isEmpty()) return false;
                if(box.pop() != '{') return false; 
               
            }
            else if(s.charAt(i)==')') {
                
                if(box.isEmpty()) return false;
                if(box.pop() != '(') return false;
              
            }
            else if(s.charAt(i)==']') {
                
                if(box.isEmpty()) return false;
                if(box.pop() != '[') return false;
              
            }
            else box.push(s.charAt(i));
            i++;
          //  System.out.println(box);
        }
        if(!box.isEmpty()) return false;
        return true;
    }
}