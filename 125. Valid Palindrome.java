class Solution {
    public boolean isPalindrome(String s) {
        String res = "";
        for(char i:s.toCharArray()){
            if(Character.isDigit(i) || Character.isLetter(i)) res+=i;
        }
        res = res.toLowerCase();
        int n = res.length();
        int i=0 , j=n-1;
        while(i<j){
            if(res.charAt(i)!=res.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
