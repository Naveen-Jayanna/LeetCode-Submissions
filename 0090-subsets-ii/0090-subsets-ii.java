class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        helper(list, new ArrayList<>(), nums, 0);
        return list;
    }
    public void helper(List<List<Integer>> list, List<Integer> temp, int[] nums, int start){
        list.add(new ArrayList<>(temp));
        for(int i= start; i<nums.length; i++){
            if(i>start && nums[i] == nums[i-1])
                continue;
            temp.add(nums[i]);
            helper(list, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }  
    }
}