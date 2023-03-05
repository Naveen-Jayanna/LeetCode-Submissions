class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int last = -1, min = -1, max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                min = max = last = i;
            } 
            if (nums[i] == minK) {
                min = i;
            } 
            if (nums[i] == maxK) {
                max = i;
            }
            ans += Math.min(max, min)-last;
        }
        return ans;
    }
}