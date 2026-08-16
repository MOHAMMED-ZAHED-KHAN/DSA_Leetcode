class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int c1=0 , mj1=0;
        int c2=0 , mj2=0;
        for(int i=0;i<n;i++){
            if(c1==0 && nums[i]!=mj2){
                c1=1;
                mj1=nums[i];
            }else if(c2==0 && nums[i]!=mj1){
                c2=1;
                mj2=nums[i];
            }else if(nums[i]==mj1){
                c1++;
            }else if(nums[i]==mj2){
                c2++;
            }else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==mj1){
                c1++;
            }else if(nums[i]==mj2){
                c2++;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        if(c1>n/3) res.add(mj1);
        if(c2>n/3) res.add(mj2);
        return res;
    }
}