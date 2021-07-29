package com.company;
import java.util.Scanner;
import java.util.Stack;


public class Main {
    public boolean isValid(String s) {
        if(s.length()%2==1){
            return false;
        }
        Stack<Character> p = new Stack();
        for( char i:s.toCharArray()){
            if(i=='(' || i=='[' || i=='{'){
                p.push(i);
            }
            else if(i==')' && p.peek()=='(' && !p.isEmpty()){
                p.pop();
            }
            else if(i==']' && p.peek()=='[' && !p.isEmpty()){
                p.pop();
            }
            else if(i=='}' && p.peek()=='{' && !p.isEmpty()){
                p.pop();
            }
        }
        return p.isEmpty();

    }




    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Main obj = new Main();
        String s = input.nextLine();
        boolean ans = obj.isValid(s);
        System.out.println(ans);
    }
}
