class Solution {
    public int maxResult(int[] a, int k) /* {
        Deque<Pair<Integer, Integer>> deque = new LinkedList<>() {{
            offer(new Pair<>(0, nums[0]));
        }};
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peekFirst().getKey() < i - k) {
                deque.pollFirst();
            }

            max = nums[i] + (deque.isEmpty() ? 0 : deque.peekFirst().getValue());

            while (!deque.isEmpty() && deque.peekLast().getValue() <= max) {
                deque.pollLast();
            }

            deque.offerLast(new Pair<>(i, max));
        }

        return max;
    } */
    {
        int n = a.length;
        
        ArrayDeque<Integer> dq = new ArrayDeque();
        
        dq.addFirst(0);
        
        for(int i = 1;i<n;i++){
            
            if(i-dq.peekFirst()>k) dq.removeFirst();
            
            a[i] += a[dq.peekFirst()];
            
            while(!dq.isEmpty() && a[i] >= a[dq.peekLast()]) dq.removeLast();
            
            dq.addLast(i);
        }
        return a[n-1];
    }
}