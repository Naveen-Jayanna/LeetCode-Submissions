class Solution {
    public String reverseWords(String str) {
        String strs[] = str.split(" ");
        for(int i = 0; i < strs.length; i++) {
            char s[] = strs[i].toCharArray();
            reverseString(s);
            strs[i] = new String(s);
        }
        return String.join(" ",strs);
    }
    private void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left < right){
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}


// public String reverseWords(String s) {
//         String[] str = s.split(" ");
//         for (int i = 0; i < str.length; i++) str[i] = new StringBuilder(str[i]).reverse().toString();
//         StringBuilder result = new StringBuilder();
//         for (String st : str) result.append(st + " ");
//         return result.toString().trim();
//     }