class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char temp[] = strs[i].toCharArray();
            Arrays.sort(temp);
            String sorted = String.valueOf(temp);
            if(map.containsKey(sorted)){
                ArrayList<String> arr = map.get(sorted);
                arr.add(strs[i]);
                map.put(sorted,arr);
            }
            else{
                ArrayList<String> arr = new ArrayList<>();
                arr.add(strs[i]);
                map.put(sorted,arr);
            }
        }
        return new ArrayList<>(map.values());
    }
}