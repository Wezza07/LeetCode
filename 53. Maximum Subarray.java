package com.company;

public class Main {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int sum=-100001 , best=-100001;
        for(int i:nums){
            sum = Math.max(i,i+sum);
            best = Math.max(sum,best);
        }
        return best;
    }

    public static void main(String[] args){
        Main obj = new Main();
        int[] nums = {-2,-1};
        int ans = obj.maxSubArray(nums);
        System.out.println(ans);
        // -1 will be printed :)
    }
}
