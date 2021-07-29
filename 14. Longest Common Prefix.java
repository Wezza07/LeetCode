package com.company;
import java.util.Scanner;


public class Main {
    String Longest(String[] s){
        if(s==null || s.length==0){
            return "";
        }
        return LongestCommonPrefix(s,0,s.length-1);
    }


    String common(String left , String right){
        int min = Math.min(left.length() , right.length());
        for(int i=0 ; i<min ; i++){
            if(left.charAt(i)!=right.charAt(i)){
                return left.substring(0,i);
            }
        }
        return left.substring(0,min);
    }


    String LongestCommonPrefix(String[] s , int l , int r){
        if(l==r){
            return s[l];
        }else{
            int mid = (l+r)/2;
            String left = LongestCommonPrefix(s,l,mid);
            String right = LongestCommonPrefix(s,mid+1,r);
            return common(left,right);

        }
    }



    public static void main(String[] args){

        Main obj = new Main();
        String[] s= {"flower","flow","flight"};
        int n = s.length;
        String ans = obj.LongestCommonPrefix(s,0,n-1);
        System.out.println(ans);
    }
}
