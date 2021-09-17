class Solution {
    public int minTimeToType(String word) {
        char start = 'a';
        int res=0;
        for(char c:word.toCharArray()){
            res+= Math.min(Math.abs(c-start) , 26-Math.abs(c-start))+1;
            start = c;
        }
        return res;
    }
}
