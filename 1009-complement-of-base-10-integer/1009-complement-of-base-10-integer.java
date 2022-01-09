class Solution {
    public int bitwiseComplement(int n) {
        int i=1, temp=1;
        while(temp<n)
            temp = (int) Math.pow(2,i++) -1;
        return temp^n;
    }
}