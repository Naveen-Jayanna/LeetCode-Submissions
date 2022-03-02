class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        for( ;i<s.length()&&j<t.length(); i++,j++){
            while(j<t.length() && s.charAt(i) != t.charAt(j))
                j++;
            if(j==t.length())
                return false;
        }
        if(i==s.length())
            return true;
        return false;
    }
}