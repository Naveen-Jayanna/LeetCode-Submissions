class Solution {
    public int findMaximumXOR(int[] nums) {
        int max=0,mask=0;
        HashSet<Integer> set=new HashSet<Integer>();
        int maxNum=0;
        for(int i:nums)
            maxNum=Math.max(maxNum,i);
        for(int i=31-Integer.numberOfLeadingZeros(maxNum);i>=0;i--){
            set.clear();
            int bit=1<<i;
            mask=mask|bit;
            int temp=max|bit;
            for(int prefix:nums){
                if(set.contains((prefix & mask)^temp))
                { 
                    max=temp;
                    break;
                }
                set.add(prefix & mask);
            }
        }
        return max;
    }
}




/*
int max = 0, mask = 0;
        for(int i = 31; i >= 0; i--){
            mask = mask | (1 << i);
            Set<Integer> set = new HashSet<>();
            for(int num : nums){
                set.add(num & mask);
            }
            int tmp = max | (1 << i);
            for(int prefix : set){
                if(set.contains(tmp ^ prefix)) {
                    max = tmp;
                    break;
                }
            }
        }
        return max;
        
*/