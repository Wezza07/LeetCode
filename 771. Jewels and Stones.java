class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int cnt=0;
        for (char i:jewels.toCharArray()){
            for (int j=0 ; j<stones.length(); j++){
                if (i==stones.charAt(j)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
