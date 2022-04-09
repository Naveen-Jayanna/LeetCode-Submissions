class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        TreeMap<Integer, List<Integer>> freqMap = new TreeMap<>();
        for(int num : map.keySet()){
           int freq = map.get(num);
           if(!freqMap.containsKey(freq)){
               freqMap.put(freq, new LinkedList<>());
           }
           freqMap.get(freq).add(num);
        }
        
        List<Integer> res = new ArrayList<>();
        while(res.size()<k){
            Map.Entry<Integer, List<Integer>> entry = freqMap.pollLastEntry();
            res.addAll(entry.getValue());
        }
        int[] arr = res.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}