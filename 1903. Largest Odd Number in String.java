class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        char c = num.charAt(n-1);
        if(isOdd(c)){
            return num;
        }
        for(int i=n-2 ; i>=0 ; i--){
            char temp = num.charAt(i);
            if(isOdd(temp)){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
    public boolean isOdd(char c){
        if(c=='1' || c=='3' || c=='5' || c=='7' || c=='9') return true;
        return false;
    }
}
