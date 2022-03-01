class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> spiral = new ArrayList<Integer>();
        
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        while(true)
        {
            //Go right
            for(int i = left; i <= right; i++)
                spiral.add(matrix[top][i]);
            top++;
            if(top > bottom) break;
            
            //Go down
            for(int i = top; i <= bottom; i++)
                spiral.add(matrix[i][right]);
            right--;
            if(right < left) break;
            
            //Go left
            for(int i = right; i >= left; i--)
                spiral.add(matrix[bottom][i]);
            bottom--;
            if(top > bottom) break;
            
            //Go up
            for(int i = bottom; i >= top; i--)
                spiral.add(matrix[i][left]);
            left++;
            if(right < left) break;
        }
        
        return spiral;
    }
}