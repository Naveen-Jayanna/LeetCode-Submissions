class Solution {
    public int climbStairs(int n) {
        int steps[] = new int[46];
        steps[1] = 1;
        steps[2] = 2;
        steps[3] = 3;
        for(int i=4; i<n+1; i++)
            steps[i] = steps[i-1] + steps[i-2];
        
        return steps[n];
        
    }
}

/*
if(n<4)
    return n;
return climbStairs(n-1) + climbStairs(n-2);
*/