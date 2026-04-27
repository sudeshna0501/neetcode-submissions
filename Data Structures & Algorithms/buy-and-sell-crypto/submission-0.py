class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_diff,max_p=0,0
        for i in range(len(prices)-1):
            for j in range(i+1,len(prices)):
                diff = prices[j]-prices[i]
                max_diff = max(max_diff,diff)
            
            max_p = max(max_p,max_diff)
        
        return max_p
        