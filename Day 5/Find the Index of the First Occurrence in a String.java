class Solution {
    public int strStr(String haystack, String needle) {
        int len=haystack.length();
        int len1=needle.length();
        if(len<len1)
            return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j)) j++;
            if(j==needle.length()) return i;
            
        }
        return -1;
    }
}