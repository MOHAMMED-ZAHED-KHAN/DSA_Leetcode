class Solution {
    public int maximumTastiness(int[] price, int k) {
        int n = price.length;
        Arrays.sort(price);
        int low =1;
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
        int count=1;
        for(int i=0;i<price.length;i++){
            if((price[i]-lp)>=mid){
                count++;
                lp=price[i];
            }
        }
        return count>=k;
    }
}