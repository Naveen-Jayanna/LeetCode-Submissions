class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int[] result = new int[n];
        for(int i = n-1; i>=0;i--)
        {
            if(Math.abs(nums[l])>Math.abs(nums[r]))
            {
                result[i] = nums[l] *nums[l];
                l++;
            }
            else
            {
                result[i] = nums[r] * nums[r];
                r--;
            }
        }
        return result;
    }
}



/*
// int[] squared = new int[nums.length];
        for(int i = 0; i<nums.length; i++)
            nums[i] *= nums[i];
        
        Arrays.sort(nums);
        return nums;
*/