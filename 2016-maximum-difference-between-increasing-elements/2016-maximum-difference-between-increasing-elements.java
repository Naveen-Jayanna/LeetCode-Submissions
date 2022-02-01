class Solution {
    public int maximumDifference(int[] nums) {
        int r = -1, i = 0;
        for (int j = 1; j < nums.length; j++)
            if (nums[i] < nums[j])
                r = Math.max(r, nums[j] - nums[i]);
            else i = j;
        return r;
    }
}