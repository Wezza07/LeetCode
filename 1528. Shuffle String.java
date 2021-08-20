class Solution {
    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        char[] ans = new char[n];
        int temp=0;
        for (int i=0 ; i<n ; i++){
            temp = indices[i];
            ans[temp] = s.charAt(i);
        }
        return new String(ans);
    }
}
