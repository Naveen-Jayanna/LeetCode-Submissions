class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int pow = 1;
        for(int i = columnTitle.length()-1 ; i>=0; i--){
            result += (1 + columnTitle.charAt(i) - 'A' ) * pow;
            pow *= 26;
        }
        return result;
    }
}