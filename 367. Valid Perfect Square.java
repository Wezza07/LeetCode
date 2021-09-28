class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 1 , r=num;
        while(r>l+1){
            long m = (l+r)/2;
            if(isGood(m,num)) r = m;
            else l = m;
        }
        return r*r==num;
    }
    public boolean isGood(long m ,int num){
         return m*m>=num;
    }
}
