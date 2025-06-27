class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==1)
        {
            if(nums[0]==val)
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
        int j,i=0;
        for(j=0;j<nums.length;j++)
        {
            if(nums[j]!=val)
            {
                nums[i++]=nums[j];
            }
        }
        return i;
    }
}
