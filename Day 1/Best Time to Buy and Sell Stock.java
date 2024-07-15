class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0],ans = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) 
                buy = prices[i];
            if (prices[i] - buy > ans) 
                ans = prices[i] - buy;
        }
        return ans;
    }
}