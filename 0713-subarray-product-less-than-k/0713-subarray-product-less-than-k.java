class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
       int left = 0, right = 0, prod = 1, ans = 0;
       while(right<nums.length) {
           prod = prod * nums[right];
           while(prod >= k) {
               prod = prod/nums[left];
               left++;
           }
           ans = ans + (right - left + 1);
           right++;
       } 
       return ans; 
    }
}