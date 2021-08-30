class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i=1 ; i<n ; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        int l=0 , r=0;
        for (int i=0 ; i<n ; i++){
            if(i>0){
                l = prefix[i-1];
            }
            r = prefix[n-1]-prefix[i];
            if(l==r){
                return i;
            }
        }
        return -1;
    }
}
