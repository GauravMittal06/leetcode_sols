class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int area=0;
        while(i<j)
        {
            int max=Math.min(height[i],height[j]);
            int width=j-i;
            area=Math.max(area,width*max);

            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return area;
    }
}
