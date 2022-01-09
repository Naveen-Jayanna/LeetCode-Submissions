class Solution {
    public boolean isHappy(int n) {
        if(n==1)
            return true;
        int sum=0;
        //HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> seen = new HashSet<>();
        //for(int i=0; i<10; i++)
          //  map.put(i,i*i);
        while(true){
            while(n!=0){
                sum+=(n%10) * (n%10);
                n/=10;
            }
            if(sum==1)
                return true;
            else{
                if(seen.contains(sum))
                    return false;
                seen.add(sum);
                n = sum;
                sum=0;
            }
        }
    }
    
    
    
    
    
    /* hare and tortise logic to find a loop. if loop found = false, else true.
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (fast != slow);
        if (slow == 1) {
            return true;
        }

        return false;
    }
    

    private int findSquare(int number){
        int ans=0;
        while (number>0){
           int rem=number%10;
           ans+= rem*rem;
           number=number/10;
        }
        return ans;
    }
    */
}