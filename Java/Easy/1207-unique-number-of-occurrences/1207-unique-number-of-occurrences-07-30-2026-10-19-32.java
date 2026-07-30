class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();
        // Set<Integer> set = new HashSet<>();

        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        return map.size()==new HashSet<>(map.values()).size();

        
        // for(int i : map.values()){
        //     if(set.contains(i)){
        //         return false;
        //     }
        //     set.add(i);
        // }

        // return true;
    }
}