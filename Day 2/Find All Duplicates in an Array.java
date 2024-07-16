class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums) {
            if(map.containsKey(i)) {
                if(list.contains(i)) continue;
                else list.add(i);
            }
            else 
            map.put(i,1);
        }
        return list;
    }
}