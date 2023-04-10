class Solution {
    public boolean isValid(String s) {
        Stack stk = new Stack();
        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '[')
                stk.push(ch);
            else{
                if(stk.size()==0)
                    return false;
                if(Math.abs((char)stk.pop()-ch) > 3)
                    return false;
            }
        }
        return stk.size()==0;
    }
}