class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int result[] = new int[queries.length];
        int even_sum = 0;
        int j= 0;
        for(int num:nums){
            if(num%2 ==0)
                even_sum += num;
        }

        for(int i=0; i<queries.length; i++){
            int pos = queries[i][1], val = queries[i][0];
            int temp = nums[pos];
            nums[pos] += val;
            if((nums[pos] & 1)== 0){
                if((temp & 1) == 0)
                    even_sum -= temp;
                even_sum += nums[pos];
            }
            else{
                if((temp & 1 )== 0)
                    even_sum -= temp;
            }
            result[j++] = even_sum;
        }
        return result;
    }
}