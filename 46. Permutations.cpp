class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> result;
        Backtracking(result , nums , 0 , nums.size()-1);
        return result;
        
    }
    
    void Backtracking(vector<vector<int>>& result, vector<int>& nums , int l , int r){
        if(l==r){
            vector<int> temp(nums);
            result.push_back(temp);
            return;
        }else{
            for(int i=l ; i<=r ; i++){
                swap(nums[l],nums[i]);
                Backtracking(result , nums , l+1 , r);
                swap(nums[l],nums[i]);
            }
        }
    }
};
