class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low=0;
        int high = m-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int row = maxeleincol(mat,mid);
            int left = mid-1>=0 ? mat[row][mid-1] : Integer.MIN_VALUE;
            int right = mid+1<m ? mat[row][mid+1] : Integer.MIN_VALUE;
            if(mat[row][mid]>left && mat[row][mid]>right){
                return new int[] {row,mid};
            }else if(left>mat[row][mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    public int maxeleincol(int[][] mat , int mid){
        int n = mat.length; // row number
        int maxele = Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<n;i++){
            if(mat[i][mid]>maxele){
                maxele=mat[i][mid];
                index=i;
            }
        }
        return index; // row number which has the max ele in col
    }
}