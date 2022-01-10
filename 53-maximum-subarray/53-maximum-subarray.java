class Solution {
    public int maxSubArray(int[] nums) {
         int result = Integer.MIN_VALUE;
        int a = 0;
        
        for (int n : nums) {
            a += n;
            result = Math.max(result, a);
            a = Math.max(a, 0);
        }
        
        return result;
    }
}