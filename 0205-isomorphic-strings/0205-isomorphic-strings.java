class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char s_char = s.charAt(i);
            char t_char = t.charAt(i);
            if(!map.containsKey(s_char)){
                if(map.containsValue(t_char))
                    return false;
                map.put(s_char,t_char);
            }
            else{
                if(t_char != map.get(s_char))
                    return false;
            }
        }
        return true;
    }
}