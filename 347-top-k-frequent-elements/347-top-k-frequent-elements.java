class Solution {
    
    public static HashMap<Integer, Integer>
    sortByValue(HashMap<Integer, Integer> hm)
    {
        HashMap<Integer, Integer> temp
            = hm.entrySet()
                  .stream()
                  .sorted((i1, i2)
                              -> i2.getValue().compareTo(
                                  i1.getValue()))
                  .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (e1, e2) -> e1, LinkedHashMap::new));
 
        return temp;
    }
    
    
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        map = sortByValue(map);
        for(int i: map.keySet()){
            list.add(i);
            k--;
            if(k==0)
                break;
        }
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}