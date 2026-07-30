class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int maxcount=0;
        int index =0;
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
}