class Solution {
    public boolean canJump(int[] nums) {
    int c = 0;
        for(int i : nums){
            if (c < 0)
                return false;
            else if(i>c)
                c = i;
            c--;
        }
            
        return true;
    }
}