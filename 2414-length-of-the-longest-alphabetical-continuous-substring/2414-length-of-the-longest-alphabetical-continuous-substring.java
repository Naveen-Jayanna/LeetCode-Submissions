class Solution {
    public int longestContinuousSubstring(String s) {
        int curr = 0, curr_high = 1, high = 0;
        for(char ch: s.toCharArray()){
            if(curr+1 == ch){
                curr = ch;
                curr_high++;
            }
            else{
                high = Math.max(curr_high, high);
                curr_high = 1;
                curr = ch;
            }
        }
        return Math.max(curr_high, high);
    }
}