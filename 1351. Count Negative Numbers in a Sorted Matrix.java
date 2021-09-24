class Solution {
    public int countNegatives(int[][] grid) {
        int res=0;
        for(int[] i:grid){
            int n = i.length;
            int l=-1 , r=n;
            while(r>l+1){
                int m = (l+r)/2;
                if(i[m]<0) r = m;
                else l=m;
            }
            res += (n-r);
        }
        return res;
    }
}
