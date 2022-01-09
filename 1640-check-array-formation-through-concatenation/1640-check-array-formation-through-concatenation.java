class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        for(int i = 0; i< arr.length; i++){
            boolean check_condition = false;
            for (int j = 0; j< pieces.length;j++){
                if(arr[i] == pieces[j][0])
                    check_condition = true;
                else
                    continue;
                if(pieces[j].length > 1){
                        int arr_index = i+1;
                        for(int k = 1; k< pieces[j].length; k++){
                            if(arr[arr_index] == pieces[j][k]){
                                check_condition = true;
                                if(pieces[j].length == k+1){
                                    i = arr_index;
                                    break;
                                }
                                else
                                    arr_index++;
                            }
                            else{
                                check_condition = false;
                                continue;
                            }
                        }
                    }
                }
            if(check_condition == false)
                return false;
            }
        return true;
        }
    }