class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length, l= 0, r = n - k ;
        
        int total = 0;
        for (int i = r; i<n; i++) {
            total += cardPoints[i];
        }
        int res = total;
        while (r < n) {
            total += (cardPoints[l] - cardPoints[r]);
            res = Math.max(res, total);
            l += 1;
            r += 1;
        }
        return res;
    }    
}




    //  public int maxScore(int[] cardPoints, int k) {
    //     int n = cardPoints.length, lSum = 0;
    //     for(int i = 0; i < k; ++i){
    //         lSum += cardPoints[i];
    //     }
    //     int max = lSum;
    //     for(int rSum = 0, i = 0; i < k; ++i){
    //         rSum += cardPoints[n-1-i];
    //         lSum -= cardPoints[k-1-i];
    //         max = Math.max(max,lSum+rSum);
    //     }
    //     return max;
    // }
