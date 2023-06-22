class Solution {
    public int fillCups(int[] A) {
        int mx = 0, sum = 0;
        for(int a: A) {
            mx = Math.max(a, mx);
            sum += a;
        }
        return Math.max(mx, (sum + 1) / 2);
    }
}



// class Solution {
//     public int fillCups(int[] amount) {
//         PriorityQueue<Integer> pQ = new PriorityQueue<>((a,b) -> b - a);
//         pQ.add(amount[0]);
//         pQ.add(amount[1]);
//         pQ.add(amount[2]);
//         int seconds = 0;
//         while(pQ.peek() != 0) {
//             seconds++;
//             int high1 = pQ.poll() - 1;
//             int high2 = pQ.poll() - 1;
            
//             pQ.add(high1 > 0 ? high1 : 0);
//             pQ.add(high2 > 0 ? high2 : 0);
//         }
        
//         return seconds;
//     }
// }