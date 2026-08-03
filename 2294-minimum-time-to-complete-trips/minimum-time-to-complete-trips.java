class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int n = time.length;
        long low =1;
        long high=0;
        int min=Integer.MAX_VALUE;
        for(int i : time){
            min=Math.min(min,i);
        }
        high=(long)min*totalTrips;
        long ans=0;
        while(low<=high){
            long mid = low+(high-low)/2;
            if(mintime(time,mid,totalTrips)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean mintime(int[] time , long mid , int totalTrips){
        long count=0;
        for(int i : time){
            count+=mid/i;
        }
        return count>=totalTrips;
    }
}