class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        int sum = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0) ? -1 : 1;                        
            if (!map.containsKey(sum)) map.put(sum, i);
            max = Math.max(max, i-map.get(sum));
        }
        
        return max;
    }
}