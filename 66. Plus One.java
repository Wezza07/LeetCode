package com.company;

public class Main {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1 ; i>=0 ; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] temp = new int[n+1];
        temp[0] = 1;
        return temp;

    }
    public static void main(String[] args){
        int[] digits = {9,9,9};
        Main obj = new Main();
        int[] ans = obj.plusOne(digits);
        for(int i=0 ; i< ans.length ; i++){
            System.out.print(ans[i] + " ");
        }
        // 1 0 0 0 will be printed :)
    }
}
