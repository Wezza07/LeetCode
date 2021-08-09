package com.company;


public class Main {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] ED = new int[n+1][m+1];
        for(int i=0 ; i<=n ; i++){
            for(int j=0 ; j<=m ; j++){
                if(i==0){
                    ED[i][j] = j;
                }
                else if(j==0){
                    ED[i][j] = i;
                }
                else if(word1.charAt(i-1)==word2.charAt(j-1)){
                    ED[i][j] = ED[i-1][j-1];
                }
                else{
                    ED[i][j] = Math.min(Math.min(ED[i-1][j-1] , ED[i-1][j]) , ED[i][j-1])+1;
                }
            }
        }
        return ED[n][m];
    }

    public static void main(String[] args){
        Main obj = new Main();
        String word1 = "intention";
        String word2 = "execution";
        int ans = obj.minDistance(word1,word2);
        System.out.println(ans);
        // 5 will be printed :)
    }
}
