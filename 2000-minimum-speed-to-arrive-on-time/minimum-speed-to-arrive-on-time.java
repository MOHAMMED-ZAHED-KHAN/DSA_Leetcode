class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length;
        if (hour < n - 1) return -1;
        int low=1;
        int high=10000000;
        int ans=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(minspeed(dist,mid,hour)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean minspeed(int[] dist , int mid , double hour){
        double totalh=0;
        for(int i=0;i<dist.length-1;i++){
            totalh+=Math.ceil((double) dist[i] / mid);
        }
        totalh+=(double)dist[dist.length-1]/mid;
        return totalh<=hour;
    }
}