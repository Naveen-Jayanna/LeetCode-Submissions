class Solution {
    public int minSteps(String s, String t) {
        int[] first = new int[26];
        // int[] second = new int[26];
        int total = 0;
        for(char ch: s.toCharArray())
            first[ch - 'a']++;
        for(char ch: t.toCharArray())
            first[ch - 'a']--;
        
        for(int i=0; i<26; i++){
            total += Math.abs(first[i]);
        }
        return total;
    }
}