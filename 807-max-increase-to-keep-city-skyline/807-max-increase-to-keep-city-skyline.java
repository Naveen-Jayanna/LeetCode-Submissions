class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] Hrow = new int[grid[0].length];
        int[] Hcol = new int[grid.length];
        int ret = 0;
        for(int i=0; i<grid.length; i++)
            for(int j=0; j<grid[i].length; j++){
                Hrow[i] = Hrow[i] < grid[i][j] ? grid[i][j] : Hrow[i];
                Hcol[i] = Hcol[i] < grid[j][i] ? grid[j][i] : Hcol[i];
            }
        
        // System.out.println(Arrays.toString(Hrow));
        // System.out.println(Arrays.toString(Hcol));

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == Hrow[i] || grid[i][j] == Hcol[j])
                    continue;
                ret += Math.min(Hrow[i],Hcol[j]) - grid[i][j];
            }
        }
        
        return ret;

    }
}