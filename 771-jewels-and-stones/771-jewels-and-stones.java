class Solution {
     public int numJewelsInStones(String jewels, String stones) {
        int result= 0;
        for(int j=0; j<jewels.length(); j++){
            for(int s=0; s<stones.length(); s++){
                if(jewels.charAt(j)==stones.charAt(s)){
                    result++;
                }
            }
        }
        return result;
    }    
    /*
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i=0; i< stones.length(); i++){
            if(jewels.contains(stones.charAt(i) +""))
                count++;
        }
        return count;
    }
    */
}