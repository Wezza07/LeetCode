public boolean canPartition(int[] nums) {
        int n = nums.length;
        if(n<2){
            return false;
        }
        int sum=0;
        for (int i:nums){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }
        sum/=2;
        boolean[][] a = new boolean[n+1][sum+1];
        for (int i=1 ; i<=sum ; i++){
            a[0][i] = false;
        }
        for (int i=1 ; i<=n ; i++){
            a[i][0] = true;
        }
        for(int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=sum ; j++){
                if(nums[i-1]<=j){
                    a[i][j] = a[i-1][j] || a[i-1][j-nums[i-1]];
                }else{
                    a[i][j] = a[i-1][j];
                }
            }
        }
        return a[n][sum];
    }
