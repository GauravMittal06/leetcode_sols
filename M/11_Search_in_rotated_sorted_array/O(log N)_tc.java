class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid;
        while(start<=end)
        {
            mid=start + (end-start)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>=nums[start]) //sorted on the left side
            {
                if(target>=nums[start] && target<nums[mid]) //checking for target on the sorted side -> left side
                {
                    end=mid-1;
                }
                else //if target not found on the sorted side, then the entire array is again believed to the a shorterned rotated ascending order array, with the 'start' from the beginning of the unsorted side
                {
                    start=mid+1;
                }
            }
            else //sorted on the right side
            {
                if(target>nums[mid] && target <=nums[end]) //checking for target on the sorted side -> right side
                {
                    start=mid+1;
                }
                else //if target not found on the sorted side, then the entire array is again believed to the a shorterned rotated ascending order array, with the 'end' at the end of the unsorted side
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
