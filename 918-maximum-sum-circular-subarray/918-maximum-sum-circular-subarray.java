class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int nonCircularSum = kadaneMaxSum(A);
        int totalSum = 0;
        for(int i=0;i<A.length;i++){
            totalSum += A[i];
            A[i] = -A[i];
        }
              
        int circularSum = totalSum + kadaneMaxSum(A);
        if(circularSum == 0)
            return nonCircularSum;
        return Math.max(circularSum,nonCircularSum);
    }
    
    int kadaneMaxSum(int[] A){
        int currentSum = A[0];
        int maxSum = A[0];
        for(int i=1;i<A.length;i++){
            if(currentSum < 0)
                currentSum = 0;
            currentSum = A[i] + currentSum;
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}

/*
        int total = 0, maxSum = A[0], curMax = 0, minSum = A[0], curMin = 0;
        for (int a : A) {
            curMax = Math.max(curMax + a, a);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + a, a);
            minSum = Math.min(minSum, curMin);
            total += a;
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
*/