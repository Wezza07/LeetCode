class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0 ; i< (1<<n) ; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0 ; j<n ; j++){
                if((i & (1<<j))>0){
                    temp.add(nums[j]);
                }
            }
            if(!res.contains(temp)){
                res.add(temp);
            }
        }
        return res;
    }
}
