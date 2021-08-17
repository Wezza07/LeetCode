class Solution {
    public int subtractProductAndSum(int n) {
        int sum , pro;
        sum = pro = n%10;
        n/=10;
        while (n>0){
            sum+=n%10;
            pro*=n%10;
            n/=10;
        }
        return pro-sum;
    }
}
