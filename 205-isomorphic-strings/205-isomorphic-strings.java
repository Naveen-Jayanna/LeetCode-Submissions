class Solution {
    public boolean isIsomorphic(String s, String t) {
        int arr1[] = new int[128];
        int arr2[] = new int[128];
        for(int i=0; i<s.length();i++){
            if(arr1[s.charAt(i)] != 0 && arr1[s.charAt(i)] != t.charAt(i))
                return false;
            if(arr2[t.charAt(i)] != 0 && arr2[t.charAt(i)] != s.charAt(i))
                return false;
            arr1[s.charAt(i)] = t.charAt(i);
            arr2[t.charAt(i)] = s.charAt(i);
        }
        return true;
        
        
        /*
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for(int i=0; i<s.length();i++){
            if(map1.containsKey(s.charAt(i)) && map1.get(s.charAt(i)) != t.charAt(i))
               return false;
            if(map2.containsKey(t.charAt(i)) && map2.get(t.charAt(i)) != s.charAt(i))
               return false;
            map1.put(s.charAt(i),t.charAt(i));
            map2.put(t.charAt(i),s.charAt(i));
        }
               return true;
        */
    }
}