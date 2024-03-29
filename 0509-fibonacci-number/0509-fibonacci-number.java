class Solution {
    public int fib(int n) {
        if(n < 2)
            return n;
        
        int[] table = new int[3];
        table[0] = 0;
        table[1] = 1;

        for(int i = 2; i<=n; ++i)           
            table[i%3] = table[(i-1)%3] + table[(i-2)%3];

        return table[n%3];
    }
}