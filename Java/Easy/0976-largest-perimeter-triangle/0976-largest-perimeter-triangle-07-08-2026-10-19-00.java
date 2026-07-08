class Solution {
    public int largestPerimeter(int[] nums) {
        int length = nums.length;
        // int largestPeri = 0;
        Arrays.sort(nums);
        for(int i=length-1; i>1; i--){
            if(nums[i]<nums[i-1]+nums[i-2]){
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        
        return 0;
    }
}