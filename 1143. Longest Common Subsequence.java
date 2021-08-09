package com.company;


public class Main {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] LCS = new int[n+1][m+1];
        for(int i=0 ; i<=n ; i++){
            for(int j=0 ; j<=m ; j++){
                if(i==0 || j==0){
                    LCS[i][j] = 0;
                }else if(text1.charAt(i-1) == text2.charAt(j-1)){
                    LCS[i][j] = 1 + LCS[i-1][j-1];
                }else{
                    LCS[i][j] = Math.max(LCS[i-1][j] , LCS[i][j-1]);
                }
            }
        }
        return LCS[n][m];
    }

    public static void main(String[] args){
        Main obj = new Main();
        String word1 = "abcde";
        String word2 = "ace";
        int ans = obj.longestCommonSubsequence(word1,word2);
        System.out.println(ans);
        // 3 will be printed :)
    }
}
