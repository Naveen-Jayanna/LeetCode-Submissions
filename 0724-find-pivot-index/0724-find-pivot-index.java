class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0, index = -1;
        int[] sum_array = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            sum_array[i] = sum;
            sum += nums[i];
        }
        sum = 0;
    
        for(int i=nums.length-1; i>=0; i--){
            if(sum_array[i] == sum)
                index = i;
            sum += nums[i];
        }
        
        return index;
    }
}