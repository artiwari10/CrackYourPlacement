class Solution {
    public void moveZeroes(int[] nums) {
        int i =0,j=1;
        int size = nums.length;
        if(size==0 || size==1) return;
        while(i<size) {
            if(nums[i]==0) {
                while(j<size && nums[j]==0) j++;
                if(j>=size) return;
                nums[i]=nums[j];
                nums[j]=0;
                i++;
            }
            else {
                if(j<size && nums[j]!=0) j++;
                 i++;
            
            }

        }
    }
}