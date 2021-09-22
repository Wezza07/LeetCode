class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        int lg = g.size() , ls = s.size();
        int i=0 , j=0;
        int res=0;
        sort(g.begin() , g.end());
        sort(s.begin() , s.end());
        while(i<lg && j<ls){
            if(s[j]>=g[i]){res++;i++;j++;}
            else j++;
        }
        return res;
    }
};
