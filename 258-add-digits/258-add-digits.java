class Solution {
    public int addDigits(int num) {
        if(num<10)
            return num;
        int result = num;
        while(result>9){
            int sum = 0;
            while(result>0){
                sum+=result%10;
                result/=10;
            }
            result = sum;
        }
        
        return result;
    }
}