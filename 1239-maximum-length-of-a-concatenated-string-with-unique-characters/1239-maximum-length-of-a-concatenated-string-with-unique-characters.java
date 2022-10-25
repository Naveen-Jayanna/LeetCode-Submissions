class Solution {
     private int result = 0;

    public int maxLength(List<String> arr) {
        if (arr == null || arr.size() == 0) {
            return 0;
        }
        dfs(arr, "", 0);
        return result;
    }

    private void dfs(List<String> arr, String path, int idx) {
        boolean isUniqueChar = false;
        Integer bin = 0;
        for (char ch : path.toCharArray())
            bin += 1 << (ch - 'a');
        if (Integer.bitCount(bin) == path.length())
            isUniqueChar = true;
        
        if (isUniqueChar) {
            result = Math.max(path.length(), result);
        }

        if (idx == arr.size() || !isUniqueChar) {
            return;
        }
        
        for (int i = idx; i < arr.size(); i++) {
            dfs(arr, path + arr.get(i), i + 1);
        }
    }
}