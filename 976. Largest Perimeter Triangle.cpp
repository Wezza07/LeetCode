class Solution {
public:
    int largestPerimeter(vector<int>& nums) {
        int n = nums.size();
        int res=0;
        sort(nums.rbegin() , nums.rend());
        for(int i=0 ; i<n-2 ; i++){
            int a = nums[i] , b=nums[i+1] , c=nums[i+2];
            if(b+c>a){
                res = a+b+c;
                return res;
            }
        }
        return 0;
    }
};
