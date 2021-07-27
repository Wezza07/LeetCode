class Solution {
public:
    int romanToInt(string s) {
        vector<pair<char,int>> r(s.size());
        for(int i=0 ; i<s.size() ; i++){
            if(s[i]=='I'){
                r[i].first = s[i];
                r[i].second = 1;
            }else if(s[i]=='V'){
                r[i].first = s[i];
                r[i].second = 5;
            }else if(s[i]=='X'){
                r[i].first = s[i];
                r[i].second = 10;
            }else if(s[i]=='L'){
                r[i].first = s[i];
                r[i].second = 50;
            }else if(s[i]=='C'){
                r[i].first = s[i];
                r[i].second = 100;
            }else if(s[i]=='D'){
                r[i].first = s[i];
                r[i].second = 500;
            }else if(s[i]=='M'){
                r[i].first = s[i];
                r[i].second = 1000;
            }
        }
        int sum=0;
        for(int i=0 ; i<s.size()-1 ; i++){
            if(r[i].second>=r[i+1].second){
                sum+=r[i].second;
                r[i].second = 0;
            }else{
                sum+=abs(r[i].second-r[i+1].second);
                r[i].second = 0;
                r[i+1].second = 0;
                i++;
            }
        }
        if(r[s.size()-1].second!=0){
            sum+=r[s.size()-1].second;
        }
        return sum;
    }
};
