class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>res = new ArrayList<>();
        List<String>ds = new ArrayList<>();
        recur(0,ds,res,s);
        return res;
    }
    public void recur(int ind , List<String>ds , List<List<String>>res , String s){
        if(ind == s.length()){
            res.add(new ArrayList<>(ds));
            return;
        }

        for(int i=ind ; i<s.length() ; i++){
            if(isPalin(s,ind,i)){
                ds.add(s.substring(ind , i+1));
                recur(i+1 , ds , res , s);
                ds.remove(ds.size()-1);
            }
        }
    }

    public boolean isPalin(String s , int start , int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}