class Solution {
    public int maxArea(int[] heights) {

        int i=0, j=heights.length-1,area;
        int maxh =0;

        while(i<j)
        {
            area=(j-i)* Math.min(heights[i], heights[j]);

            if(heights[i]<=heights[j]) i++;
            else j--;

            maxh = Math.max(maxh,area);
        }
        return maxh;
    }
}
