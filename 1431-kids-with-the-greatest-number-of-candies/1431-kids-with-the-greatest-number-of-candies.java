class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>(candies.length);
        int gauge = 0;
        for (int candy : candies) {
            gauge = Math.max(candy, gauge);
        }
		gauge -= extraCandies;
        for (int candy : candies) {
            ans.add(candy >= gauge);
        }
        return ans;
    }
}