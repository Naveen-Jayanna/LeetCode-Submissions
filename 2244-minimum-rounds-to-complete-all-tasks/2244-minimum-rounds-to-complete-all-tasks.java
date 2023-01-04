class Solution {
    public int minimumRounds(int[] tasks) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: tasks){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int value: map.values()){
           if (value == 1) return -1;
            count += (value + 2) / 3;
        }
        return count;
    }
}