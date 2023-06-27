class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;
        List<List<Integer>> res = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] + a[1] - b[0] - b[1]);
        for (int i = 0; i < m && pq.size() < k; i++) {
            pq.add(new int[]{nums1[i], nums2[0], 0});
        }
        while (k-- > 0 && !pq.isEmpty()) {
            int[] now = pq.poll();
            List<Integer> temp = new ArrayList<>();
            temp.add(now[0]);
            temp.add(now[1]);
            res.add(temp);
            if (now[2] < n-1)
                pq.add(new int[]{now[0], nums2[now[2] + 1], now[2] + 1});
        }
        return res;
    }
}