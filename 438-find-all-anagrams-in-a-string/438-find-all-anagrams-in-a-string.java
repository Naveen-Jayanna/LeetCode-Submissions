class Solution {
    public List<Integer> findAnagrams(String s, String t) {
        List<Integer> result = new LinkedList<>();
        if(t.length()> s.length()) return result;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int counter = map.size();
        
        int begin = 0, end = 0;
        int head = 0;
        int len = Integer.MAX_VALUE;
        
        
        while(end < s.length()){
            char c = s.charAt(end);
            if( map.containsKey(c) ){
                map.put(c, map.get(c)-1);
                if(map.get(c) == 0) counter--;
            }
            end++;
            
            while(counter == 0){
                char tempc = s.charAt(begin);
                if(map.containsKey(tempc)){
                    map.put(tempc, map.get(tempc) + 1);
                    if(map.get(tempc) > 0){
                        counter++;
                    }
                }
                if(end-begin == t.length()){
                    result.add(begin);
                }
                begin++;
            }
            
        }
        return result;
    }
}



/* Using 2 arrays to hold the frequency of the characters
        List<Integer> result = new ArrayList<Integer>();
        int size_s = s.length(), size_p = p.length();
        if(size_p>size_s)
            return result;
        
        int[] alpha = new int[26];
        int[] temp = new int[26];
        for(char c:p.toCharArray())
            alpha[c - 'a']++;

        for(int i=0; i<size_s-size_p+1; i++){
            boolean flag = true;
            temp = alpha.clone();
            for(int j=0; j<size_p;j++)
                temp[s.charAt(j+i)- 'a']--;
            
            for(int k=0; k<25; k++){
                if(temp[k]!=0){
                    flag = false;
                    break;
                }
            }
            if(flag)
                result.add(i);   
        }
        
        return result;
*/