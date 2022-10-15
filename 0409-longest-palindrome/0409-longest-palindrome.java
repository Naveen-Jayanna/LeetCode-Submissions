class Solution {
    public int longestPalindrome(String s) {
        int count[]=new int[128];
        int result=0;
        boolean oddvalue=false;
        for(char c:s.toCharArray()){
            count[c]++;
        }
        for(int occurence:count){
            if(occurence%2==0){
                result+=occurence;
            }
            else{
                oddvalue=true;
                occurence--;
                result+=occurence;
            }
        }
        if(oddvalue)
            result++;
        
        return result;
    }
}