class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0)
            return 0;
        if(haystack.length()==0)
            return -1;
        int j=0;
        char[] str1 = haystack.toCharArray();
        char[] str2 = needle.toCharArray();
        for(int i=0; i<str1.length; i++){
            if(str1[i] == str2[j]){
                int first = i;
                while(j<str2.length && first<str1.length && str1[first]==str2[j] ){
                    first++;
                    j++;
                }
                if(j==str2.length)
                    return i;
                j=0;
            }           
        }
        return -1;
    }
}