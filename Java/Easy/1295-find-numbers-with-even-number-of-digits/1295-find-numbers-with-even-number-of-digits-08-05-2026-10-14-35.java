class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;

        for(int i : nums){
            int count = 0;
            while(i>0){
                i /= 10;
                count++;
            }

            if(count%2 == 0){
                evenCount++;
            }

        }
        return evenCount;
    }
}