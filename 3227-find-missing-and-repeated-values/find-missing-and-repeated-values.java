class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int N = n*m;
        int repeated=-1;
        int missing=-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        for(int i=0;i<=N;i++){
            if(!map.containsKey(i)){
                missing=i;
            }else if(map.get(i)==2){
                repeated=i;
            }
        }
        return new int[]{repeated,missing};
    }
}