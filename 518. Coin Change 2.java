public int change(int amount, int[] coins) {
        int[] count = new int[amount+1];
        Arrays.fill(count , 0);
        count[0] = 1;
        for(int c:coins){
            for(int i=1 ; i<=amount ; i++){
                if(c<=i){
                    count[i]+=count[i-c];
                }
            }
        }
        return count[amount];
    }
