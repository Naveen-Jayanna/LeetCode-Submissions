class Solution {
    public int[] rearrangeBarcodes(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) map.put(n, map.getOrDefault(n, 0) + 1);
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, (a, b) -> map.get(b) - map.get(a));
        int i = 0, len = arr.length;
        for (int key : keys) {
            int cnt = map.get(key);
            while (cnt-- > 0) {
                arr[i] = key;
                i+= 2;
                if (i >= len) i = 1;                
            }
        }
        return arr;
    }
}