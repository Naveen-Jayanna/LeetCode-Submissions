class Solution {
    public boolean validMountainArray(int[] a) {
        int size = a.length;
        int i=0, j=size-1;
        if(size < 3)
            return false;
        while(i<size-1){
            if(a[i]<a[i+1])
                i++;
            else
                break;
        }
        while(j>0){
            if(a[j-1]>a[j])
                j--;
            else
                break;
        }
        if(j==size-1 || i==0)
            return false;
        return i==j? true : false;
    }
}