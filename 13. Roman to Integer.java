package com.company;
import java.util.Scanner;


public class Main {
    public int romanToInt(String s) {
        char[] rom = s.toCharArray();
        int[] in = new int[s.length()];

        for(int i=0 ; i<s.length() ; i++){
            if(rom[i]=='I'){
                in[i] = 1;
            }else if(rom[i]=='V'){
                in[i] = 5;
            }else if(rom[i]=='X'){
                in[i] = 10;
            }else if(rom[i]=='L'){
                in[i] = 50;
            }else if(rom[i]=='C'){
                in[i] = 100;
            }else if(rom[i]=='D'){
                in[i] = 500;
            }else if(rom[i]=='M'){
                in[i] = 1000;
            }
        }
        int sum=0;
        for(int i=0 ; i<s.length()-1 ; i++){
            if(in[i]>=in[i+1]){
                sum+=in[i];
                in[i] = 0;
            }else{
                sum+= (in[i+1]-in[i]);
                in[i] = 0;
                in[i+1] = 0;
                i++;
            }
        }
        if(in[s.length()-1]!=0){
            sum+=in[s.length()-1];
        }
        return sum;

    }



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Main obj = new Main();
        String s = input.nextLine();
        int sol = obj.romanToInt(s);
        System.out.println(sol);
    }
}
