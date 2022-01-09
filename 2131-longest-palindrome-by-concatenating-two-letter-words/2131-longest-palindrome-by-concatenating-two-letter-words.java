class Solution {
    public int longestPalindrome(String[] words) {
        if(words.length == 2 && words[0].charAt(0)== words[0].charAt(1) && words[0].equals(words[1]))
            return 4;

        HashMap<String,Integer> map = new HashMap<>();
        int sum = 0, same = 0;
        for(int i=0; i< words.length; i++)
            map.put(words[i],map.getOrDefault(words[i],0)+2);

        System.out.println(map);
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Integer> entry = iterator.next();
            int val = entry.getValue();
            String key = entry.getKey();
            if(key.charAt(0)==key.charAt(1)){
                if(val%4!=0)
                    same = 2;
                sum+=(val/4)*4;
                continue;
            }
            StringBuilder sb=new StringBuilder(key);  
            String rev = sb.reverse().toString();
            if(map.containsKey(rev)){
                int temp = map.get(rev);
                sum += Math.min(temp,val)*2;
            }
            iterator.remove();
        }
        return sum+same;
    }   
}