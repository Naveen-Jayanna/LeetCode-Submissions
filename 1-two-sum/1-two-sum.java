class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
        
        for(int i=0; i<nums.length;i++){
            if(map.get(nums[i])!=null) 
            {
                int[]  res={map.get(nums[i]), i};
                return res;
            }
            else
            map.put(target-nums[i], i);
        }
        return new int[0];
    }
}