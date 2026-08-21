class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int element=0;
        HashMap<Integer,Integer> mapp = new HashMap<>();
        for(int i : nums){
            mapp.put(i,mapp.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> ele : mapp.entrySet()){
            int count=ele.getValue();
            if(count==1){
                element=ele.getKey();
            }
        }
        return element;
    }
}