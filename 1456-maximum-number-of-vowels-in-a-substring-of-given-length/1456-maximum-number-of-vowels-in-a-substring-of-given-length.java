class Solution {
    public int maxVowels(String s, int k) {
                int i = 0, j = 0, max = Integer.MIN_VALUE, total = 0;
        while (j < s.length()) {
            if (isVowel(s.charAt(j)))
                total++;
            while (j - i + 1 == k) {
                max = Math.max(max, total);
                if (i < s.length() && isVowel(s.charAt(i))) {
                    total--;
                }
                i++;
            }
            j++;
        }
        return max;
    }
    private boolean isVowel( char ch ) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
