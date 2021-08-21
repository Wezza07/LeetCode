class Solution {
    public int balancedStringSplit(String s) {
        int cnt=0;
        int l=0,r=0;
        for (char i:s.toCharArray()){
            if(i=='R'){
                r++;
            }else if (i=='L'){
                l++;
            }
            
            if(l==r){
                cnt++;
                l=0;
                r=0;
            }
        }
        return cnt;
    }
}
