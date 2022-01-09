class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        
        Queue<Character> que = new LinkedList<>();
        int result = 0;
        for(char curr : s.toCharArray()){
            if(que.contains(curr)){
                while(que.peek()!=curr){
                    que.poll();
                }
                que.poll();
            }
            que.add(curr);
            result = Math.max(result,que.size());
        }
        
        return result;
    }
    /*
     public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
    */
}
