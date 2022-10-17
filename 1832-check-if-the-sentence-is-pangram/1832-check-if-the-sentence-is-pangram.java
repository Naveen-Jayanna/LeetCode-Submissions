class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() <26)
            return false;
        int[] str = new int[26];
        for(char ch: sentence.toCharArray())
            str[ch - 'a']++;
        
        for(int count: str)
            if(count==0)
                return false;
        return true;
    }
}