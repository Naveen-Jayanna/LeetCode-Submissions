class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int ns = s.length();
        int np = p.length();
        if(ns < np) return new ArrayList<>();
        int[] f1 = new int[26];
        for(char c : p.toCharArray()) {
            f1[c - 'a']++;
        }
        
        List<Integer> list = new ArrayList<>();
        int[] f2 = new int[26];
        char[] ss = s.toCharArray();
        for(int i = 0; i < ns; i++) {
            f2[ss[i] - 'a']++;
            if(i >= np) {
                f2[ss[i - np] - 'a']--;
            }
            
            boolean f = true;
            for(int j = 0; j < 26; j++) {
                if(f1[j] != f2[j]) {
                    f = false;
                    break;
                }
            }
            if(f)
                list.add(i - np + 1);
        }
        return list;
    }
}