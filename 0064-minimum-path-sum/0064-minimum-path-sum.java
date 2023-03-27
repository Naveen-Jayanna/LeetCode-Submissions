class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length, n=grid[0].length;
        int[] dp= new int[n+1];
        for (int j=0; j<n; j++) dp[j+1]=dp[j]+grid[0][j];
        dp[0]=Integer.MAX_VALUE;
        for (int i=1; i<m; i++)
            for (int j=0; j<n; j++)
                dp[j+1]=Math.min(dp[j], dp[j+1])+grid[i][j];
        return dp[n];
    }
//     public int minPathSum(int[][] grid) {
//         int row = grid.length;
//         int col = grid[0].length;
        
//         for(int i=1;i<col;i++){
//             grid[0][i] += grid[0][i-1];
//         }
        
//         for(int i=1;i<row;i++){
//             grid[i][0] += grid[i-1][0];
//         }

//         for(int i=1;i<row;i++){
//             for(int j=1;j<col;j++){
//                 grid[i][j] = Math.min(grid[i][j]+grid[i-1][j],grid[i][j]+grid[i][j-1]);
//             }
//         }

//         return grid[row-1][col-1];
//     }
}

/*

*/