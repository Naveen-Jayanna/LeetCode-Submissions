class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() <26)
            return false;
        int[] str = new int[26];
        boolean check = false;
        for(char ch: sentence.toCharArray())
            if(str[ch-'a'] == 0)
                str[ch - 'a']++;
        
        if(Arrays.toString(str).contains("0"))
            return false;
        return true;
    }
}