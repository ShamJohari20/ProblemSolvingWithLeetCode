class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        int len  = arr.length;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int minCount = Integer.MAX_VALUE;

        for(int i=1; i<len; i++){
            minCount = Math.min(minCount, arr[i]-arr[i-1]);
        }
        
        for(int i=1; i<len; i++){
            if(arr[i]-arr[i-1]==minCount){
                list.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }

        return list;
    }
}