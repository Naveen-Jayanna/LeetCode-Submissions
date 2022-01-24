class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        String num = "0123456789";
        int low_size = Integer.toString(low).length();
        int high_size = Integer.toString(high).length();
        int first_ele = low / (int)Math.pow(10,low_size-1);
        int last_ele = high / (int)Math.pow(10,high_size-1);
        
        while(low_size <= high_size){
            if(first_ele + low_size > 10){
                first_ele = 1;
                low_size++;
            }
            else{
                int curr_num = Integer.parseInt(num.substring(first_ele,first_ele + low_size));
                if(curr_num > high)
                    break;
                if(curr_num < low){
                    first_ele++;
                    continue;
                }
                    
                arr.add(curr_num);
                first_ele++;
            }
        }
        
        return arr;
    }
}