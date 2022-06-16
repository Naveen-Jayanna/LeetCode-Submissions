class Solution {
    public int[] sortedSquares(int[] nums) {
        // int[] squared = new int[nums.length];
        for(int i = 0; i<nums.length; i++)
            nums[i] *= nums[i];
        
        Arrays.sort(nums);
        return nums;
    }
}