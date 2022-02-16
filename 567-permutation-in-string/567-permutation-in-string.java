class Solution {
    public boolean checkInclusion(String s1, String s2) {
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
    }
}