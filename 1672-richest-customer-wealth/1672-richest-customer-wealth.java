class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0,sum = 0, rows = accounts.length, col = accounts[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                sum += accounts[i][j];
            }
            max = Math.max(max,sum);
            sum = 0;
        }
        return max;
    }
}