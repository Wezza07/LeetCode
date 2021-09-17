class Solution {
    public String maximumTime(String time) {
        String ans = "";
        if(time.substring(0,2).equals("??")){
            ans+="23:";
        }else if(time.charAt(0)=='?' && time.charAt(1)<'4'){
            ans+='2';
            ans+=time.charAt(1);
            ans+=':';
        }else if(time.charAt(0)=='?' && time.charAt(1)>='4'){
            ans+='1';
            ans+=time.charAt(1);
            ans+=':';
        }else if(time.charAt(1)=='?' && time.charAt(0)=='2'){
            ans+=time.charAt(0);
            ans+="3:";
        }else if(time.charAt(1)=='?' && time.charAt(0)<'2'){
            ans+=time.charAt(0);
            ans+="9:";
        }else{
            ans+=time.substring(0,2);
            ans+=':';
        }

        if(time.substring(3).equals("??")){
            ans+="59";
        }else if(time.charAt(4)=='?'){
            ans+=time.charAt(3);
            ans+='9';
        }else if(time.charAt(3)=='?'){
            ans+='5';
            ans+=time.charAt(4);
        }else{
            ans+=time.substring(3);
        }
        return ans;
    }
}
