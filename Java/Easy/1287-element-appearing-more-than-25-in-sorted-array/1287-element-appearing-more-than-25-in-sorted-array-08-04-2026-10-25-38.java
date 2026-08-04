class Solution {
    public int findSpecialInteger(int[] arr) {
        
        // Map<Integer,Integer> map = new HashMap<>();

        // for(int i : arr){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }

        // int count=0;
        // int ele=0;
        // for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        //     if(entry.getValue()>count){
        //         count = entry.getValue();
        //         ele = entry.getKey();
        //     }
        // }
        // return ele;

        int len = arr.length;

        int limit = len/4;

        int count =1;


        for(int i=1; i<len; i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else{
                count =1;
            }
            if (count>limit)return arr[i] ;

        }
        return arr[0];
    }

}