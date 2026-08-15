class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(nums1[i]==nums2[j]){
                if(ans.isEmpty() || ans.get(ans.size()-1)!=nums1[i] && ans.get(ans.size()-1)!=nums2[j]){
                    ans.add(nums1[i]);
                }
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] arr = new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            arr[k]=ans.get(k);
        }
        return arr;
    }
}