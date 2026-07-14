class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int len = nums.length;

        Arrays.sort(nums);
        for(int i=0; i<len && k>0; i++){
            if(nums[i]<0){
            nums[i] = -nums[i];
            k--;
            }
        }  

        int sum=0;
        int min = Integer.MAX_VALUE; 

        for(int i : nums){
            sum+=i;
            min = Math.min(min,i);
        }     

        if(k%2==1){
            sum -= 2 * min;
        }

        return sum;
    }
}
