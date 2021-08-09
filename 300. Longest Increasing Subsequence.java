package com.company;
import java.util.Arrays;


public class Main {
    public int lengthOfLIS(int[] nums) {
        int[] LIS = new int[nums.length];
        Arrays.fill(LIS , 1);
        int temp = 1;
        for(int i = 1 ; i<nums.length ; i++){
            for(int j=0 ; j<i ; j++){
                if(nums[j]<nums[i]){
                    LIS[i] = Math.max(LIS[i] , LIS[j]+1);
                    if(temp < LIS[i]){
                        temp = LIS[i];
                    }
                }
            }
        }
        return temp;
    }

    public static void main(String[] args){
        Main obj = new Main();
        int[] nums = {0,1,0,3,2,3};
        int ans = obj.lengthOfLIS(nums);
        System.out.println(ans);
        // 4 will be printed :)
    }
}
