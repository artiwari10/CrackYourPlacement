class Solution {
    public String intToRoman(int num) {
         Map<Integer,String> map = new LinkedHashMap();
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");
        if(map.containsKey(num)) return map.get(num);
        List<Integer> list = new ArrayList();
        for(int key: map.keySet()) list.add(key);
        
        String ans = "";
        for(int i=list.size()-1;i>=0 && num>0;i--){
             int temp=0;
             if(num>list.get(i)){
                 temp= num/list.get(i);
                 num =num%list.get(i);
                 ans += map.get(list.get(i)).repeat(temp);
                 if(map.containsKey(num)){
                      ans += map.get(num);
                      num=0;
                    }
                }
            }
         return ans;
    }
}