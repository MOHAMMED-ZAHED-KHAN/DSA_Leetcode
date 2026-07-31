class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n =mat.length;
        int m =mat[0].length;
        int maxcount=0;
        int index =0;
        for(int i=0;i<n;i++){
            int rowwisecount=0;
            for(int j=0;j<m;j++){
                rowwisecount+=mat[i][j];
                if(rowwisecount>maxcount){
                    maxcount=rowwisecount;
                    index=i;
                }
            }
        }
        return new int[] {index,maxcount};
    }
}