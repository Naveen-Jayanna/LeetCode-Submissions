class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashSet set = new HashSet();
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            int j=i;
            while(j<arr.length && arr[j] == arr[i]){
                j++;
            }
            if(set.contains(j-i+1))
                return false;
            set.add(j-i+1);
            if(i!=j)
                i = j-1;
            
        }
        return true;
    }
}