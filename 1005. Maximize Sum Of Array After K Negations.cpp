class Solution {
public:
    int largestSumAfterKNegations(vector<int>& nums, int k) {
        int n = nums.size();
        int sum=0;
        sort(nums.begin() , nums.end());
        for(int i=0 ; i<n && nums[i]<0 && k>0 ; i++ , k--) nums[i] = -nums[i];
        int minn = nums[0];
        for(auto j:nums){
            sum+=j;
            minn = min(minn,j);
        }
        return k%2==0 ? sum : sum-2*minn;
    }
};
