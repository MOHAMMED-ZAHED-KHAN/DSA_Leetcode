class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count=0;
        int mj=0;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                mj=nums[i];
            }else if (nums[i]==mj){
                count++;
            }else{
                count--;
            }
        }
        count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==mj){
                count++;
            }
        }
        if(count>n/2){
            return mj;
        }
        return -1;
    }
}