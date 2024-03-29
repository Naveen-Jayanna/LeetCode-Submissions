class Solution {
    public int climbStairs(int n) {
        int[] steps = new int[45];
        steps[0] = 1;
        steps[1] = 2;
        for(int i=2; i<=n-1; i++)
            steps[i] = steps[i-1] + steps[i-2];
        
        return steps[n-1];
        
    }
}