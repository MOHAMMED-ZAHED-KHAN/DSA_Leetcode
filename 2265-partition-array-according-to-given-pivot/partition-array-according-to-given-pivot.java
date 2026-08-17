class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                less.add(nums[i]);
            }else if(nums[i]==pivot){
                equal.add(nums[i]);
            }else{
                greater.add(nums[i]);
            }
        }
        int[] ans = new int[n];
        int index=0;
        for(int i=0;i<less.size();i++){
            ans[index]=less.get(i);
            index++;
        }
        for(int i=0;i<equal.size();i++){
            ans[index]=equal.get(i);
            index++;
        }
        for(int i=0;i<greater.size();i++){
            ans[index]=greater.get(i);
            index++;
        }
        return ans;
    }
}