class Solution {
    public int findSpecialInteger(int[] arr) {
        
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int count=0;
        int ele=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>count){
                count = entry.getValue();
                ele = entry.getKey();
            }
        }
        return ele;
    }

}