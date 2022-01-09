class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int stops[] = new int[1001];
        for(int t[] : trips){
            int start = t[1];
            int end = t[2];
            while(start<end){
                stops[start]+=t[0];
                if(stops[start++] > capacity)
                    return false;
            }
        }
        return true;
    }
}