class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minprice=prices[0];
        int maxprofit=0;
        for(int i=1;i<n;i++){
            minprice=Math.min(minprice,prices[i]);
            maxprofit=Math.max(maxprofit,prices[i]-minprice);
        }
        return maxprofit;
    }
}