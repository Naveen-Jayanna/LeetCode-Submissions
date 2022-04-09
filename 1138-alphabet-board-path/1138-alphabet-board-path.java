class Solution {
    public String alphabetBoardPath(String target) {
        int x = 0, y=0;
        StringBuilder str = new StringBuilder();
        for(char ch: target.toCharArray()){
            int val = ch - 'a';
            int x_curr = val/5;
            int y_curr = val%5;
            int x_diff = Math.abs(x-x_curr);
            int y_diff = Math.abs(y-y_curr);
            
           if(x>x_curr){
                while(x_diff!=0){
                    str.append("U");
                    x_diff--;
                }
            }
            if(y>y_curr){
                while(y_diff!=0){
                    str.append("L");
                    y_diff--;
                }
            }
            if(x<x_curr){
                while(x_diff!=0){
                    str.append("D");
                    x_diff--;
                }
            }
            
            if(y<y_curr){
                while(y_diff!=0){
                    str.append("R");
                    y_diff--;
                }
            }
            str.append("!");
            x=x_curr;
            y=y_curr;
                
        }
        return str.toString();
    }
}