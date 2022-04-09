class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k==nums.length) return nums;
        Map<Integer, Integer>map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b)->{return b.getValue() - a.getValue();});
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
       
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }
        int[] list = new int[k];
        while(k>0){
            list[k-1]=maxHeap.poll().getKey();
            k--;
        }
        
        return list;
    }
}