class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0, minp=prices[0], j=0, profit;
        for(int i=1;i<prices.length;i++)
        {
            minp = Math.min(prices[j], minp);
            profit = prices[i]-minp;
            j++;

            maxp = Math.max(maxp, profit);
        }
        return maxp;
    }
}

