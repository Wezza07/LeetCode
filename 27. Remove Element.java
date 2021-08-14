public int removeElement(int[] nums, int val) {
        if(nums.length==0 || (nums.length==1 && nums[0]==val)){
            return 0;
        }
        if(nums.length==1 && nums[0]!=val){
            return 1;
        }
        int i=0;
        for (int j=0 ; j<nums.length ; j++){
            if(nums[j]!=val){
                nums[i++]=nums[j];
            }
        }
        return i;
    }
