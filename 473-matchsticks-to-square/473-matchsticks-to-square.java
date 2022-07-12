class Solution {
    public boolean makesquare(int[] matchsticks) {
        Arrays.sort(matchsticks);
        int sum=0;
        for(int matchstick:matchsticks) sum+=matchstick;
        for(int i=0,j=matchsticks.length-1;i<j;i++,j--){
            int temp=matchsticks[i];
            matchsticks[i]=matchsticks[j];
            matchsticks[j]=temp;
        }
        
        int target=sum/4;
        if(matchsticks.length<4||sum%4!=0||matchsticks[0]>target) return false;
        
        return dfs(matchsticks, target, 0,0,0,new boolean[matchsticks.length]);
        
    }
    
    public boolean dfs(int[] nums,int target,int curSum,int start,int count, boolean[] used){
       
        if(count==3) return true;
        if(curSum==target) return dfs(nums,target,0,0,count+1,used);
            for(int i=start;i<nums.length;i++){
                if(used[i]||i>0&&nums[i]==nums[i-1]&&!used[i-1]) continue;
                if(curSum+nums[i]>target) continue;
                used[i]=true;
                if(dfs(nums,target,curSum+nums[i],i+1,count,used)) return true;
                used[i]=false;
        }
        return false;
        
        
    }
}
//         if (nums == null || nums.length < 4) return false;
//         int sum = 0;
//         for (int num : nums) sum += num;
//         if (sum % 4 != 0) return false;
        
//         Arrays.sort(nums);
//         reverse(nums);
        
//     	return dfs(nums, new int[4], 0, sum / 4);
//     }
    
//     private boolean dfs(int[] nums, int[] sums, int index, int target) {
//     	if (index == nums.length) {
//     	    if (sums[0] == target && sums[1] == target && sums[2] == target) {
//     		return true;
//     	    }
//     	    return false;
//     	}
    	
//     	for (int i = 0; i < 4; i++) {
//     	    if (sums[i] + nums[index] > target) continue;
//     	    sums[i] += nums[index];
//             if (dfs(nums, sums, index + 1, target)) return true;
//     	    sums[i] -= nums[index];
//     	}
    	
//     	return false;
//     }
    
//     private void reverse(int[] nums) {
//         int i = 0, j = nums.length - 1;
//         while (i < j) {
//             int temp = nums[i];
//             nums[i] = nums[j];
//             nums[j] = temp;
//             i++; j--;
//         }
//     }
// }