class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split(" ");
        String[] sorted = new String[arr.length];
        String ans = "";
        for (String i: arr){
            int indx = i.charAt(i.length()-1) - '0';
            sorted[indx-1] = i.substring(0,i.length()-1);
        }
        for (String i: sorted){
            ans+=i+" ";
        }
        return ans.trim();
    }
}
