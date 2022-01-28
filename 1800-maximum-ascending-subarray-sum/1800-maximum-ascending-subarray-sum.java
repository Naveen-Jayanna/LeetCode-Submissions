class Solution {
    public int maxAscendingSum(int[] nums) {
        int curr_sum = 0, max_sum = 0, size = nums.length;
        for(int i=0; i<size; i++){
            curr_sum += nums[i];
            if( i!=size-1 && nums[i] >= nums[i+1]){
                max_sum = Math.max(curr_sum,max_sum);                
                curr_sum = 0;
            }
        }
        return Math.max(curr_sum,max_sum);
    }
}