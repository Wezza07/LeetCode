class Solution {
public:
    int longestPalindrome(string s) {
        map<char,int> m;
        int n = s.size();
        for(int i=0 ; i<n ; i++){
            m[s[i]]++;
        }
        int length=0 , rem=0;
        for(auto i:m){
            int temp = i.second;
            if(temp%2==0) length+=temp;
            else{
                length += temp-1;
                rem = 1;
            }
        }
        int res = length+rem;
        return res;
    }
};
