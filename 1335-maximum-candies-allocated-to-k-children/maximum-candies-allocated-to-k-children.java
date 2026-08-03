class Solution {
    public int maximumCandies(int[] candies, long k) {
        int n = candies.length;
        int low=1;
        int high=0;
        long sum=0;
        for(int i: candies){
            sum+=i;
            high=Math.max(high,i);
        }
        if(sum<k){
            return 0;
        }
        int ans=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(maxcandies(candies,mid,k)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public boolean maxcandies(int[] candies , int mid , long k){
        long count=0;
        for(int i:candies){
            count+=i/mid;
        }
        return count>=k;
    }
}