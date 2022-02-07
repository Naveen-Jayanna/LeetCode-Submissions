class Solution {
    public char findTheDifference(String s, String t) {
        
        int diff = 0;
        int i = 0;
        for(; i < s.length(); i++) {
            diff = diff ^ s.charAt(i) ^ t.charAt(i);
        }
        diff = diff ^ t.charAt(i);
        return (char) diff;
        
    }
}

/*
        int[] alpha = new int[26];
        for(char ch: s.toCharArray())
            alpha[ch - 'a']++;
        
        for(char ch: t.toCharArray()){
            if(alpha[ch- 'a'] == 0)
                return ch;
            alpha[ch- 'a']--;
        }
        return ' ';
*/