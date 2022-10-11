class Solution {
    int[][] dp;
    public int numRollsToTarget(int n, int k, int target) {
        dp = new int[n+1][target+1];
        for(int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        return getTraverse(n, k, target);
    }
    
    public int getTraverse(int n, int k, int target){
        if(target < n || target > n*k) return 0;
        if(n==1) return target <= k ? 1 : 0;
        if(dp[n][target] != -1) return dp[n][target];
        int sum =0;
        for(int i=1 ; i<=k;i++){
            sum+=getTraverse(n-1, k, target-i);
            sum%=1000000007;
            
        }
        dp[n][target]=sum;
        return sum;
    }
}