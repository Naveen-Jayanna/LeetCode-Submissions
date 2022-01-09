class Solution {
    public String capitalizeTitle(String title) {
        String[] str = title.split(" ");
        String[] finalstr= new String[str.length];
        int i = 0;
        for(String s:str){
            s = s.toLowerCase();
            if(s.length()>2){
                char[] chararr = s.toCharArray();
                chararr[0] = Character.toUpperCase(chararr[0]);
                s = String.valueOf(chararr);
            }            
            finalstr[i++] = s;
        }
         return String.join(" ",finalstr);
    }
}