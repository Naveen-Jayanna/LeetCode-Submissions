class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long lowestTime = 1;
        long maxTime = Long.MAX_VALUE;
        while(lowestTime < maxTime){
            long mid = lowestTime + (maxTime-lowestTime)/2;
            if(tripsCompleted(time, mid, totalTrips))
                maxTime = mid;
            
            else
                lowestTime = mid+1;
            
        }
        return lowestTime;
    }

    private boolean tripsCompleted(int[] time, long currentTime, int totalTrips){
        long tripsDone = 0;
        for(int t : time){
            long tmp = (long) t;
            tripsDone += (currentTime/tmp);
            if(tripsDone >= totalTrips )
                return true;
            
        }
        return tripsDone >= totalTrips;
    }
}