class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f=0 , t=0;
        for(int i:bills){
            if(i==5) f++;
            else if(i==10){
                if(f==0) return false;
                f--;
                t++;
            }
            else{
                if(f==0) return false;
                if(t==0 && f>3) f-=3;
                else if(t>0 && f>0){
                    t--;
                    f--;
                }else return false;
            }
        }
        return true;
    }
}
