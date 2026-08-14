class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int r=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[r-1]){
                nums[r]=nums[i];
                r++;
            }
        }
        return r;
    }
}