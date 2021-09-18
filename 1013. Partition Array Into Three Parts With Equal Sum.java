class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int i:arr) sum+=i;
        if(sum%3!=0) return false;
        int part = sum/3;
        int cnt=0;
        sum = 0;
        for(int i:arr){
            sum+=i;
            if(sum==part){
                cnt++;
                sum=0;
            }
        }
        return cnt>=3;
    }
}
