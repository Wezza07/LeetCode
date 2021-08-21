class Solution {
    public String interpret(String command) {
        String ans = "";
        char[] t = command.toCharArray();
        for (int i=0 ; i<command.length() ;i++){
            if (t[i] == '(' && t[i+1] == ')'){
                i++;
                ans+='o';
            }
            else if(t[i] == '(' && t[i+1] == 'a' && t[i+2] == 'l' && t[i+3] == ')'){
                i+=3;
                ans+="al";
            }else{
                ans+=t[i];
            }
        }
        return ans;
    }
}
