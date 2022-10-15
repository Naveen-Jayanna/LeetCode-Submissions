class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<Character>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count+=2;
            }else{
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty()) return count+1;
        return count;
    }
}