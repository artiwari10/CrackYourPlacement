class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length-1;
        int ans1 = nums[l]*nums[l-1]*nums[l-2];
        int ans2 = nums[l]*nums[0]*nums[1];
        return Math.max(ans1,ans2);
    }
}