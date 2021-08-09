package com.company;


public class Main {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] sum = new int[n][m];
        sum[0][0] = grid[0][0];
        for(int i=1 ; i<m ; i++){
            sum[0][i] = grid[0][i] + sum[0][i-1];
        }
        for(int i=1 ; i<n ; i++){
            sum[i][0] = grid[i][0] + sum[i-1][0];
        }
        for(int i=1 ; i<n ; i++){
            for(int j=1 ; j<m ; j++){
                sum[i][j] = Math.min(sum[i][j-1] , sum[i-1][j]) + grid[i][j];
            }
        }
        return sum[n-1][m-1];
    }

    public static void main(String[] args){
        Main obj = new Main();
        int[][] grid = {{1,2,3} , {4,5,6}};
        int ans = obj.minPathSum(grid);
        System.out.println(ans);
        // 12 will be printed :)
    }
}
