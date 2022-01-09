class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i+=2)
            if( i == nums.length-1 || nums[i] != nums[i+1])
                return nums[i];
        return 0;
    }
    
    /*  XOR of same number yields 0. So number with only 1 occurence remain after XOR of all the elements.
     public int singleNumber(int[] nums) {
        int singleNum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			singleNum = singleNum ^ nums[i];
		}
		return singleNum;
    }    
    */
}