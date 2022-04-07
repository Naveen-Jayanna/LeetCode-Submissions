class Solution {
    public int lastStoneWeight(int[] stones) {
        int c = stones.length;
        while(c > 1){
            Arrays.sort(stones);
            stones[c-2]=stones[c-1] - stones[c-2];
            c--;
        }
        return stones[0];
        
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        // List<Integer> list = new ArrayList<Integer>();
        // for (int i : stones)
        // {
        //     list.add(i);
        // }
        // while(list.size() != 1){
        //     Collections.sort(list);
        //     int size = list.size();
        //     int diff = Math.abs(list.get(size-1) - list.get(size-2));
        //     list.set(size-2, diff);
        //     list.remove(size-1);
        // }
        // return list.get(0);
