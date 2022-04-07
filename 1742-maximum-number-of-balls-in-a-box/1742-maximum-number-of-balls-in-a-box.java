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
            map.put(sum, map.getOrDefault(sum,0) + 1);
            count = count < map.get(sum) ? map.get(sum) : count;
        }
        return count;
    }
}