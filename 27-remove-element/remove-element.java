class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int r=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[r]=nums[i];
                r++;
            }
        }
        return r;
    }
}