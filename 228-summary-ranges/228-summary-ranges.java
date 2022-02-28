class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length == 0)
            return new ArrayList<String>();
        ArrayList<String> result = new ArrayList<>();
        String temp = "";
        for(int i=0; i<nums.length; i++){
            int first = nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1]){
                i++;
            }
            temp = nums[i]!=first ? first + "->"+nums[i] : first + "";
            result.add(temp);
            temp = "";
        }
        return result;
    }
}