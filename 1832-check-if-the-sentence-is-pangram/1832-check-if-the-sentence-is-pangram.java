class Solution {
    public boolean checkIfPangram(String sentence) {
        String allAlphabets = "abcdefghijklmnopqrstuvwxyz";
        
        if(sentence.length()< 26) return false;
        
        for(int i = 0; i < allAlphabets.length(); i++)
            if(sentence.indexOf(allAlphabets.charAt(i)) == -1) return false;
        
        
        return true;
    }
}
//         if(sentence.length() <26)
//             return false;
//         int[] str = new int[26];
//         boolean check = false;
//         for(char ch: sentence.toCharArray())
//             if(str[ch-'a'] == 0)
//                 str[ch - 'a']++;
        
//         if(Arrays.toString(str).contains("0"))
//             return false;
//         return true;