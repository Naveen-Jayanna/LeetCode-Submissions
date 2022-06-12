class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int result[][]=new int[matrix[0].length][m];
        
        int i,j;
        for(i=0;i<m;i++){
            for(j=0;j<matrix[0].length;j++){
                result[j][i]=matrix[i][j];
            }
        }
        
        
        return result;
    }
}