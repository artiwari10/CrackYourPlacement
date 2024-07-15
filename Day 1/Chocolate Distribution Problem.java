
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long ans = Integer.MAX_VALUE;
        for(int i =0;(i+m-1)<a.size();i++) {
            ans = Math.min(ans,(a.get(i+m-1)-a.get(i)));
        }
        return ans;
    }
}