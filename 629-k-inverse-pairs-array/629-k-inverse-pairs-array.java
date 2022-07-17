class Solution {
    public int mod = (int) 1e9 + 7;

    public int kInversePairs(int n, int k) {
        // if (n == 1) {
        //     return 1;
        // }
        int[][] dp = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][j] = (dp[i][j - 1] + dp[i - 1][j]) % mod;
                if (j >= i) {
                    dp[i][j] = (dp[i][j] - dp[i - 1][j - i] + mod) % mod;
                }
            }
        }
        return dp[n][k];
    }
}






// class Solution {
//     public int kInversePairs(int n, int k) {
//         int mod = 1000000007;
//         if (k > n*(n-1)/2 || k < 0) return 0;
//         if (k == 0 || k == n*(n-1)/2) return 1;
//         long[][] dp = new long[n+1][k+1];
//         dp[2][0] = 1;
//         dp[2][1] = 1;
//         for (int i = 3; i <= n; i++) {
//             dp[i][0] = 1;
//             for (int j = 1; j <= Math.min(k, i*(i-1)/2); j++) {
//                 dp[i][j] = dp[i][j-1] + dp[i-1][j];
//                 if (j >= i) dp[i][j] -= dp[i-1][j-i];
//                 dp[i][j] = (dp[i][j]+mod) % mod;
//             }
//         }
//         return (int) dp[n][k];
//     }
// }