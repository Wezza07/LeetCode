class Solution {
public:
    int largestPerimeter(vector<int>& nums) {
        int n = nums.size();
        sort(nums.rbegin() , nums.rend());
        for(int i=0 ; i<n-2 ; i++){
            int a = nums[i] , b=nums[i+1] , c=nums[i+2];
            if(b+c>a) return a+b+c;
        }
        return 0;
    }
};
