class Solution {
    public int maxArea(int[] height) {
         int sum = 0;
    int i = 0,j=height.length -1;
    while(i < j) {
        int curr = Math.min(height[i],height[j])*(j-i);
       // System.out.println(curr);
        sum=Math.max(curr, sum);
        if(height[i] > height[j]) {
            j--;
        }
        else
        i++;

    }
    return sum;
    }
}