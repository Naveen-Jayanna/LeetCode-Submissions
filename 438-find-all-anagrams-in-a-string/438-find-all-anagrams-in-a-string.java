class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();
        int size_s = s.length(), size_p = p.length();
        if(size_p>size_s)
            return result;
        
        int[] alpha = new int[26];
        int[] temp = new int[26];
        for(char c:p.toCharArray())
            alpha[c%97]++;

        for(int i=0; i<size_s-size_p+1; i++){
            boolean flag = true;
            temp = alpha.clone();
            for(int j=0; j<size_p;j++)
                temp[s.charAt(j+i)%97]--;
            
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
    }
}