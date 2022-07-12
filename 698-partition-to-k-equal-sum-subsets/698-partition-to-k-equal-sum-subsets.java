class Solution {
       public boolean backtrack(int[] nums, int[] res, int target, int n, int index) {
        if (index == -1) {
            for (int r : res) {
                if (r > target) {
                    return false;
                }
            }
            return true;
        }
        for (int i = 0; i < res.length; i++) {
            if (i - 1 >= 0 && res[i - 1] == 0) {
                break;
            }
            if (res[i] + nums[index] <= target) {
                res[i] += nums[index];
                if (backtrack(nums, res, target, n, index-1)) {
                    return true;
                }
                res[i] -= nums[index];
            }
        }
        return false;
    }
    public boolean canPartitionKSubsets(int[] nums, int k) {
        // calculate sum first
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            sum += num;
            max = Math.max(max, num);
        }
        if (sum % k != 0 || max > sum / k) {
            return false;
        }
        int partSum = sum / k;
        Arrays.sort(nums);
        int[] res = new int[k];
        return backtrack(nums, res, partSum, nums.length, nums.length - 1);
    }
}