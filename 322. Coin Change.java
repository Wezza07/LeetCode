public int coinChange(int[] coins, int amount) {
        int[] min = new int[amount+1];
        min[0] = 0;
        for(int i=1 ; i<=amount ; i++){
            min[i] = 10001;
            for(int c:coins){
                if (i-c>=0){
                    min[i] = Math.min(min[i] , min[i-c]+1);
                }
            }
        }
        return min[amount];
    }
