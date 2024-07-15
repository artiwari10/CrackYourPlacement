class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length ==0) return 0;
        int i =0,j=1,ans=1;
        while(j<nums.length) {
            if(nums[i]==nums[j]) {
                j++;

            }
            else {
                i++;
                nums[i] = nums[j];
                ans++;
                j++;
            }
        }
        return ans;

    }
}