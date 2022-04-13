class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int first = 1, last = n * n;

        int top = 0, left = 0, bottom = n - 1, right = n - 1;

        while (first <= last) {
            for (int i = left; i <= right && first <= last; i++) {
                matrix[top][i] = first++;
            }
            top++;
            for (int i = top; i <= bottom && first <= last; i++) {
                matrix[i][right] = first++;
            }
            right--;
            for (int i = right; i >= left && first <= last; i--) {
                matrix[bottom][i] = first++;
            }
            bottom--;
            for (int i = bottom; i >= top && first <= last; i--) {
                matrix[i][left] = first++;
            }
            left++;
        }
        return matrix;
    }
}