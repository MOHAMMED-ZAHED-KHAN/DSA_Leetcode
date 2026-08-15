class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int zerocount=0;
        int maxones=0;
        int l=0;
        for(int r=0;r<n;r++){
            if(nums[r]==0){
                zerocount++;
            }
            while(zerocount>k){
                if(nums[l]==0){
                    zerocount--;
                }
                l++;
            }
            maxones=Math.max(maxones,r-l+1);
        }
        return maxones;
    }
}