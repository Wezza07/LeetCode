class Solution {
    public int maximum69Number (int num) {
        int n=0;
        int temp = num;
        while(temp!=0){
            temp/=10;
            n++;
        }
        int[] digits = new int[n];
        for(int i=n-1 ; i>=0 ; i--){
            digits[i] = num%10;
            num/=10;
        }
        for(int i=0 ; i<n ; i++){
            if(digits[i]==6){
                digits[i] = 9;
                break;
            }
        }
        int res=0;
        for(int i=0 ; i<n ; i++){
            res = (res*10) + digits[i];
        }
        return res;
    }
}
