class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : stones)
        {
            list.add(i);
        }
        while(list.size() != 1){
            Collections.sort(list);
            int size = list.size();
            int diff = Math.abs(list.get(size-1) - list.get(size-2));
            list.set(size-2, diff);
            list.remove(size-1);
        }
        return list.get(0);
    }
}