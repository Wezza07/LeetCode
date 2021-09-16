class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0;
        if(n==0){
            return true;
        }
        else if(flowerbed.length==1){
            return flowerbed[0]==0;
        }
        if(flowerbed[0] == 0 && flowerbed[1] == 0){
            flowerbed[0] = 1;
            cnt++;
        }
        if(flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] == 0){
            flowerbed[flowerbed.length-1] = 1;
            cnt++;
        }
        for(int i=1 ; i< flowerbed.length-1 ; i++){
            if (flowerbed[i] == 0 && (flowerbed[i-1]==0 && flowerbed[i+1]==0)) {
                flowerbed[i] = 1;
                cnt++;
            }
        }
        if(cnt>=n) return true;
        return false;

    }
}
