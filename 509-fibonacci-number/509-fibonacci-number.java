class Solution {
    public int fib(int n) {
        if(n<2)
            return n;
        
        int[] table = new int[n+1];
        table[0] = 0;
        table[1] = 1;

        for(int i = 2; i<table.length; ++i)           
            table[i] = table[i-1] + table[i-2];

        return table[n];
    }
}

/*
if(n<2)
    return n;
return fib(n-1) + fib(n-2);
*/