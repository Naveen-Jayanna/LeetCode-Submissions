class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=lowLimit; i<=highLimit; i++){
            int sum = 0, num = i;
            while(num>0){
                sum += num%10;
                num /= 10;
            }
            int val = map.getOrDefault(sum,0);
            map.put(sum, val + 1);
            count = count < val + 1 ? val + 1 : count;
        }
        return count;
    }
}