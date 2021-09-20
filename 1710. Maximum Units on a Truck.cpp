class Solution {
public:
    int maximumUnits(vector<vector<int>>& boxTypes, int truckSize) {
        vector<pair<int,int>> temp;
        for(int i=0 ; i<boxTypes.size() ; i++){
            temp.push_back(make_pair(boxTypes[i][1] , boxTypes[i][0]));
        }
        sort(temp.rbegin() , temp.rend());
        int res=0;
        for(int i=0 ; i<temp.size() && truckSize>0 ; i++){
            int n = temp[i].second;
            int boxes = temp[i].first;
            if(n<=truckSize){
                res+=n*boxes;
                truckSize-=n;
            }
            else{
                res+=truckSize*boxes;
                break;
            }
        }
        return res;
    }
};
