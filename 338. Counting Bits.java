class Solution {
    public int[] countBits(int n) {
        int[] a = new int[n+1];
        a[0]=0;
        int i=0 , b=1;
        while(b<=n){
            while (i<=b && (i+b)<=n){
                a[i+b] = a[i]+1;
                i++;
            }
            i=0;
            b*=2;
        }
        return a;
    }
}
