class Solution:
    def maxArea(self, heights: List[int]) -> int:
        i,j = 0, len(heights) -1
        maxwater  =0

        while i<j :
            water = (j-i)*min(heights[i], heights[j])
            maxwater = max(water, maxwater)
            if heights[i] <= heights[j]:
                i+=1
            else:
                j-=1
        
        return maxwater
                    