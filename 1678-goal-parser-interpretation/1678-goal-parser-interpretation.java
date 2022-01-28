class Solution {
    public String interpret(String command) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<command.length();i++){
            if(command.charAt(i) == '('){
                if(command.charAt(i+1) == ')'){
                    str.append("o");
                    i++;
                }
                else{
                    str.append("al");
                    i+=3;
                }
            }
            else
                str.append("G");
        }
        return str.toString();
    }
}
