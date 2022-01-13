class Solution {
    public int findMinArrowShots(int[][] points) {
        //Arrays.sort(points, (a, b) -> a[1] > b[1] ? 1 : -1);
        Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));
        int arrowPos = points[0][1];
        int arrowCnt = 1;
        for (int[] p: points) {
            if (arrowPos >= p[0]) {
                continue;
            }
            arrowCnt++;
            arrowPos = p[1];
        }
        return arrowCnt; 
    }
}