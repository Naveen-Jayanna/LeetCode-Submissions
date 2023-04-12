class Solution {
    public String removeStars(String s) {
        char[] stack = new char[s.length()];
        int i=0;
        for(char c:s.toCharArray()){
            if(c == '*')
                i--;
            else
                stack[i++]=c;
        }
        return String.valueOf(stack,0,i);
    }
}