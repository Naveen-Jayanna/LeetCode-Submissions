class Solution {
    public int missingNumber(int[] nums) {
        int largest = nums.length;
        int totalSum = largest * (largest + 1) / 2;
        for(int num: nums) {
            totalSum -= num;
        }
        return totalSum;
    }
}