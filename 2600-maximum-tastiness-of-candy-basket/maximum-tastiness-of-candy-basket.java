class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int n = price.length;
        int low=1;
        int high=price[n-1]-price[0];
        int ans=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(maxt(price,mid,k)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public boolean maxt(int[] price , int mid , int k){
        int lp=price[0];
        int bcount=1;
        for(int i : price){
            if((i-lp)>=mid){
                bcount++;
                lp=i;
            }
        }
        return bcount>=k;
    }
}