class Solution {
    public int subarraySum(int[] nums, int k) {
        int s = 0;
        int cnt = 0;

        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            s += nums[i];

            if (s == k)
                cnt += 1;
            
            if (hm.containsKey(s - k))
                cnt += hm.get(s - k);

            hm.put(s, hm.getOrDefault(s, 0) + 1);            
        }

        return cnt;
    }
}