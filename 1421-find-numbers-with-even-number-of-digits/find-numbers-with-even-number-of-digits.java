class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int digits=(int)Math.floor(Math.log10(nums[i]))+1;
            if(digits%2==0){
                count++;
            }
        }
        return count;
    }
}