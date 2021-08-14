class Solution {
    public int searchInsert(int[] nums, int target) {
        return BinarySearch(nums,0,nums.length-1,target);
    }

    int BinarySearch(int[] nums , int l , int r , int target){
        if(target>nums[r]){
            return r+1;
        }else if (target<nums[l]){
            return l;
        }else if (r>=l){
            int m = (r+l)/2;
            if(nums[m]==target){
                return m;
            }else if (nums[m]<target){
                return BinarySearch(nums , m+1 , r , target);
            }else{
                return BinarySearch(nums , l , m-1 , target);
            }
        }
        return -1;
    }
}
