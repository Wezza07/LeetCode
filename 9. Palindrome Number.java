class Solution {
    public boolean isPalindrome(int x) {
        String s = String.format("%d",x);
        int i=0 , j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev=0;
        int t = x;
        while (x>0){
            int temp = x%10;
            rev = (rev)*10+temp;
            x/=10;
        }
        if(t==rev) return true;
        return false;
    }
}
