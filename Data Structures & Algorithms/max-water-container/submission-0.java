class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int area = 0;
        while(left<right)
        {
            int width = right-left;
            if(heights[left]<=heights[right])
            {
                area = Math.max(area, width*heights[left]);
                left++;
            }
            else
            {
                area = Math.max(area, width*heights[right]);
                right--;
            }
        }
        return area;
    }
}
