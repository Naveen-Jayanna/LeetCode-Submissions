class Solution {
    public String minRemoveToMakeValid(String s) {
        int open = 0;
        StringBuilder result = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch == '('){
                open++;
                result.append(ch);
            }
            else if(ch ==')'){
                if(open > 0){
                    open--;
                    result.append(ch);
                }
                continue;
            }
            else
                result.append(ch);
        }
        
        if(open>0){
            for(int i=result.length()-1 ; i>=0 && open>0;i--){
                if(result.charAt(i) == '('){
                    result.deleteCharAt(i);
                    open--;
                }
            }
        }
        
        return result.toString();
    }
}