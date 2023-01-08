class Solution {
     public int maxPoints(int[][] points) {
        if(points.length < 3)return points.length;
        int maxPoints = 0;
        for(int[] cord1 : points)
        { Map<Double,Integer> hm= new HashMap<>();
            for(int[] cord2 : points)
            { if(cord1 == cord2) continue;
                double slope=0;
                if(cord2[0] == cord1[0])
                   slope=Double.POSITIVE_INFINITY; 
                else
                {slope =(cord2[1]-cord1[1])/(double)(cord2[0]-cord1[0]);}
                hm.put(slope, hm.getOrDefault(slope,0)+1);
                if(hm.get(slope)> maxPoints)
                    maxPoints=hm.get(slope);
            }}
        return maxPoints+1;
    }
}