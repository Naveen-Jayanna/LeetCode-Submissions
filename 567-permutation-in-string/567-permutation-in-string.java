class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;
        
        int[] count = new int[26];
        for (int i = 0; i < len1; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        if (allZero(count)) return true;
        
        for (int i = len1; i < len2; i++) {
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - len1) - 'a']++;
            if (allZero(count)) return true;
        }
        
        return false;
    }
    
    private boolean allZero(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        return true;
        
    }
}
        
/*
        if(s1.length() > s2.length())
            return false;
        int[] arr = new int[26];
        int[] temp = new int[26];
        boolean flag;
        for(char ch: s1.toCharArray())
            arr[ch - 'a']++;
        
        
        for(int i=0; i<s2.length()-s1.length()+1; i++){
            temp = arr.clone();
            flag = true;
            for(int j=i; j<i+s1.length(); j++){
                temp[s2.charAt(j) - 'a']--;
                if(temp[s2.charAt(j) - 'a'] < 0){
                    flag = false;
                    break;
                }
            }
            if(flag)
                return true;           
        }
        return false;
*/