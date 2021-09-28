class Solution {
    public int arrangeCoins(int n) {
        long l=1 , r=n;
        while(r>l+1){
            long m = (l+r)/2;
            if(good(m,n)) l = m;
            else r = m;
        }
        return (int)l;
    }
    public boolean good(long m , long n){
        return (m*(m+1))/2<=n;
    }
}
