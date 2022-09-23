class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        ArrayList<Integer> result = new ArrayList<>();
        int even_sum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2 ==0)
                even_sum += nums[i];
        }

        for(int i=0; i<queries.length; i++){
            int pos = queries[i][1], val = queries[i][0];
            int temp = nums[pos];
            nums[pos] += val;
            if(nums[pos]%2 == 0){
                if(temp%2 == 0)
                    even_sum -= temp;
                even_sum += nums[pos];
            }
            else{
                if(temp%2 == 0)
                    even_sum -= temp;
            }
            result.add(even_sum);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}