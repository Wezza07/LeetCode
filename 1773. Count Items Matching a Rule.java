class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int t=0;
        switch (ruleKey){
            case "type" :
                t = 0;
                break;
            case "color" :
                t = 1;
                break;
            default:
                t = 2;
                break;
        }
        int count=0;
        for (List<String> i :items){
            if(i.get(t).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
