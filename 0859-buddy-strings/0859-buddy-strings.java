class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        if (s.equals(goal)) {
            Set<Character> set = new HashSet<Character>();
            for (char c : s.toCharArray()) set.add(c);
            return set.size() < s.length();
        }
        int swap = 2;
        char s_1 = '\0', s_2 = '\0';
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){
                swap--;
                if(swap == 1){
                    s_1 = s.charAt(i);
                    s_2 = goal.charAt(i);
                }
                else if(swap == 0){
                    if(s_1 == goal.charAt(i) && s_2 == s.charAt(i)){
                        continue;
                    }
                    else
                        return false;
                }
                else{
                    return false;
                }
            }
        }
        return swap==0;
    }
}