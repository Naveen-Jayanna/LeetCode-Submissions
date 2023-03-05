class Solution {
    public boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        for (int i = 0, j = c.length - 1; i < j; ) {
            if (!Character.isLetterOrDigit(c[i])) i++;
            else if (!Character.isLetterOrDigit(c[j])) j--;
            else if (Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--])) 
                return false;
        }
        return true;
    }
}

// boolean isPalindrome(String s) {
//   s = s.toLowerCase().replaceAll("[^0-9a-z]", "");
//   return s.equals(new StringBuilder(s).reverse().toString());
// }