class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int maxcount=0;
        int index =0;

        // Since the array is not sorted to using binary search is actually slower than O(n^2) ..
        // if the questions mentions that array is sorted then we will use Binary search approach..

        // int x=1;
        // for (int i = 0; i < n; i++) {
        //     Arrays.sort(mat[i]);   // sort each row
        // }
        // for(int i=0;i<n;i++){
        //     int rowcount=0;
        //     rowcount=m-maxones(mat[i],m,x);
        //     if(rowcount>maxcount){
        //         maxcount=rowcount;
        //         index=i;
        //     }
        // }
        
        for(int i=0;i<n;i++){
            int rowcount=0;
            for(int j=0;j<m;j++){
                rowcount+=mat[i][j];
                if(rowcount>maxcount){
                    maxcount=rowcount;
                    index=i;
                }
            }
        }
        return new int[]{index,maxcount};
    }
    // public int maxones(int[] mat , int n , int x){
    //     int low =0;
    //     int high=n-1;
    //     int ans=n;
    //     while(low<=high){
    //         int mid = low+(high-low)/2;
    //         if(mat[mid]>=x){
    //             ans=mid;
    //             high=mid-1;
    //         }else{
    //             low=mid+1;
    //         }
    //     }
    //     return ans;
    // }
}