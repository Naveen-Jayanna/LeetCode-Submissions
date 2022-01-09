class Solution {
    public int numberOfBeams(String[] bank) {
        int size = bank.length;
        int[] rows = new int[size];
        int start=0,end=1,laser=0;
        for(int i=0; i<size; i++)
            rows[i] = getLasers(bank[i]);
        System.out.println(Arrays.toString(rows));
        while(end<size){
            int first = rows[start],last = rows[end++];
            laser+=first*last;
            if(last != 0)
                start=end-1;
            System.out.println(laser);
        }
            
        return laser;
        
    }
    public int getLasers(String row){
        int ones = 0;
        for(char ch: row.toCharArray())
            if(ch == '1')
                ones++;
        return ones;
            
    }
}