class Solution {
    public int maxProduct(int[] nums) {
        int currmax = 1, max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            currmax *= nums[i];
            max = Math.max(currmax, max);
            if(currmax == 0)
                currmax = 1;
        }
        currmax = 1;
        for(int i=nums.length - 1; i>=0; i--){
            currmax *= nums[i];
            max = Math.max(currmax, max);
            if(currmax == 0)
                currmax = 1;
        }
        
        return max;
    }
}