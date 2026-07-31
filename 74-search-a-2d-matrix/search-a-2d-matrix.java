class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0;
        int high = n*m-1; // this is  last index in 1D array(hypothetically)
        while(low<=high){
            int mid = low+(high-low)/2;
            int row = mid/m; // row number
            int col = mid%m; // column number
            if(matrix[row][col]==target){
                return true;
            }else if (matrix[row][col]<=target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
}