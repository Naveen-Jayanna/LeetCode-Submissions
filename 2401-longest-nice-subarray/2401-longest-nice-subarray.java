class Solution {
    public int longestNiceSubarray(int[] nums) {
        int AND = 0, i = 0, res = 0, n = nums.length;
        for (int j = 0; j < n; ++j) {
            while ((AND & nums[j]) > 0)
                AND ^= nums[i++];
            AND |= nums[j];
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}