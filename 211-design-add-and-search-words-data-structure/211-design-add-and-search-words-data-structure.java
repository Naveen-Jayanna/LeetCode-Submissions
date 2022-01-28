class WordDictionary {
    
    HashMap<Integer,HashSet<String>> map;

    public WordDictionary() {
        map = new HashMap<>();
    }
    
    public void addWord(String word) {
        HashSet<String> set;
        int size = word.length();
        if(map.containsKey(size))
            set = map.get(size);    
        else
            set = new HashSet<>();
        
        set.add(word);
        map.put(size,set);
    }
    
    public boolean search(String word) {        
        int size = word.length();
        
        if(!map.containsKey(size))
            return false;
        
        if(word.contains("."))
            return searchWithDot(word);
        
        HashSet<String> set = map.get(size);
        if(set.contains(word))
            return true;
        return false;
        
    }
    
    public boolean searchWithDot(String word) {
        int size = word.length();
        HashSet<String> set = map.get(size);
        for(String setWord : set){
            int i = 0;
            for(; i<size; i++){
                if(word.charAt(i) == '.')
                    continue;
                if(word.charAt(i) != setWord.charAt(i))
                    break;
            }
            if(i==size)
                return true;
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */