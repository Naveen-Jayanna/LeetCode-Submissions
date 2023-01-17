class Solution {
    public int minFlipsMonoIncr(String s) {
        if(s == null || s.length() <= 0 )
		    return 0;

        char[] str = s.toCharArray();
        int minFlips = 0;
        int minOne = 0;
        for(int i=0; i < s.length(); i++)
        {
           if(str[i] == '1')
               minOne++;

            else if(minOne > 0)
           {
               minFlips++;
               minOne--;
           }
        }
        return minFlips;
    }
}