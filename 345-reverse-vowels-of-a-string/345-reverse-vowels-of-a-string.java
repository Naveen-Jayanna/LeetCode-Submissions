class Solution {
    public String reverseVowels(String s) {
        int start = 0, end = s.length()-1;
        String vowels = "aeiouAEIOU";
        char[] str = s.toCharArray();
        while(start<end){
            if(vowels.contains(str[start]+"")){
                while(start!=end){
                    if(vowels.contains(str[end]+"")){
                        char temp = str[start];
                        str[start] = str[end];
                        str[end] = temp;
                        start++;
                        end--;
                        break;
                      }
                    end--;
                }
            }
            else
                start++;
        
        }
        return new String(str);
    }
}