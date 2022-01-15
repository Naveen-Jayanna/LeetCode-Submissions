class Solution {
    public int findPeakElement(int[] nums){
        int n = nums.length;
        if(n == 1)
            return 0;
        int[] ele = new int[n+2];
        ele[0] = ele[n+1] = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
            ele[i+1] = nums[i];
        for(int i=1; i<n+1;i++){
            int next=i+1;
            int prev =i-1;
            if(ele[i]>ele[prev] && ele[i]>ele[next])
                return i-1;
        }
    return -1;
    }
}