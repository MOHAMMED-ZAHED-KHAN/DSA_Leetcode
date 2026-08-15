class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count=0;
        int maxones=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
                maxones=Math.max(maxones,count);
            }else{
                count=0;
            }
        }
        return maxones;
    }
}