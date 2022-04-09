class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int copy[] = nums.clone();
        Arrays.sort(copy);
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length, j=0;
        for(int i=n-k; i<n; i++){
            list.add(copy[i]);
        }
        int[] res = new int[k];
        for(int i=0; i<nums.length && j<k; i++){
            if(list.contains(nums[i])){
                res[j++] = nums[i];
                list.remove(new Integer(nums[i]));
            }
        }
        return res;
    }
}