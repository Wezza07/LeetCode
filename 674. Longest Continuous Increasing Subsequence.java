class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        if(n==1){
            return n;
        }
        int i=0 , j=1 , max=0 , cnt=0;
        while (i<n && j<n){
            if(nums[i]<nums[j]){
                i++;
                j++;
                cnt++;
                max = Math.max(max,cnt+1);
            }
            else{
                i = j;
                j++;
                max = Math.max(max,cnt+1);
                cnt=0;
            }
        }
        return max;
    }
}
