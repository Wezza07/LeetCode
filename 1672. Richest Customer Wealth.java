class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;
        int sum = 0 , max=0;
        for (int i=0 ; i<n ; i++){
            for (int j=0;j<m;j++){
                sum+=accounts[i][j];  
            }
            max = Math.max(max,sum);
            sum = 0;
        }
        return max;
    }
}
