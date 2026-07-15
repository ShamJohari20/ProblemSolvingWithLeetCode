class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0;

        for(int i : arr){
            totalSum += i; 
        }

        if(totalSum %3 != 0) return false;

        int target = totalSum/3;
        int currentSum = 0;
        int count =0;

        for(int i : arr){

            currentSum += i;

            if(target == currentSum){
                count ++;
                currentSum = 0;
            }
        }

        if(count >=3){
            return true;
        }

        return false;
        
    }


}