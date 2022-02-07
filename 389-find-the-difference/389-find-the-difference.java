class Solution {
    public char findTheDifference(String s, String t) {
        int[] alpha = new int[26];
        for(char ch: s.toCharArray())
            alpha[ch - 'a']++;
        
        for(char ch: t.toCharArray()){
            if(alpha[ch- 'a'] == 0)
                return ch;
            alpha[ch- 'a']--;
        }
        return ' ';
    }
}