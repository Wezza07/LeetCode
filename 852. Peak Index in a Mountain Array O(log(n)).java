class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0 , r = arr.length-1;
        while(r>l+1){
            int m = (l+r)/2;
            if(isValid(m,arr)) l = m;
            else r=m;
        }
        return l;
    }
    
    boolean isValid(int m,int[] arr){
        if(arr[m]>arr[m-1]) return true;
        return false;
    }
}
