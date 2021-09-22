class Solution {
public:
    vector<int> minSubsequence(vector<int>& nums) {
        vector<int> res;
        int n = nums.size();
        sort(nums.rbegin() , nums.rend());
        int j=0;
        while(true){
            int sum=0;
            for(int i=0 ; i<=j ; i++){
                sum+=nums[i];
            }
            int temp=0;
            for(int i=j+1 ; i<n ; i++){
                temp+=nums[i];
            }
            res.push_back(nums[j]);
            if(temp>=sum) j++;
            else return res;
        }
    }
};
