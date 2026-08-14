class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n =nums.length;
        HashMap<Integer,Integer> mapp = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            mapp.put(nums[i],mapp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> ele : mapp.entrySet()){
            int count=ele.getValue();
            if(count==2){
                ans.add(ele.getKey());
            }
        }
        return ans;
    }
}