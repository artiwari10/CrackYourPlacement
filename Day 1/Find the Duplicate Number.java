class Solution {
    public int findDuplicate(int[] nums) {
         HashMap<Integer,Integer> map = new HashMap<>();
        int ans =0;
        for(int i =0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                ans= nums[i];
                return nums[i];
            }
            else map.put(nums[i],i);
        }
        return ans;
    }
}