class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] arr= new int[60];
        int total = 0;
        for(int i=0; i<time.length; i++)
            arr[time[i]%60]++;
        int start=1, end = 59;
        while(start<end){
            total += arr[start++]*arr[end--];
        }
        total+=(arr[0]*(arr[0]-1))/2;
        total+=(arr[30]*(arr[30]-1))/2;
        return total;
    }
}