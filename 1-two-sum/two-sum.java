class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> mapp = new HashMap<>();
        for(int i=0;i<n;i++){
            int moreneeded = target - nums[i];
            if(mapp.containsKey(moreneeded)){
                return new int[]{mapp.get(moreneeded),i};
            }else{
                mapp.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}