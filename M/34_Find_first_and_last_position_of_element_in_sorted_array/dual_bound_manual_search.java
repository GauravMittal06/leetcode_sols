class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        int left=0;
        int right=nums.length-1;
        int mid;
        while(left<=right)
        {
            mid=left+((right-left)/2);

                //if the mid has reached the target
            if(nums[mid]==target)
            {
                return getIndexes(nums,mid,target,result);
            }

                //if mid is smaller than the target
            if(nums[mid]<target)
            {
                left=mid+1;
            }
            else //if mid is larger than the target
            {
                right=mid-1;
            }
        }
        return result;
    }
    
    public static int[] getIndexes(int[] nums, int mid, int target, int[] result)
    { //logic to find end indexes in O(logN) complexity 

        int start=0,leftEnd=mid;
        int rightStart=mid,end=nums.length-1;

            //for left boundary index
        while(start<=leftEnd)
        {
            int mid1=start+(leftEnd-start)/2;
            if(nums[mid1]>=target)
            {
                leftEnd=mid1-1;
            }
            else
            {
                start=mid1+1;
            }
        }

            //for right boundary index
        while(rightStart<=end)
        {
            int mid2=rightStart+(end-rightStart)/2;
            if(nums[mid2]<=target)
            {
                rightStart=mid2+1;
            }
            else
            {
                end=mid2-1;
            }
        }

            //if the loop terminates because of array boundary limits, we check whether the resutant boundaries are equal to target or not (OPTIONAL)
        // if(nums[start]!=target) start=-1;
        // if(nums[end]!=target) end=-1;

        result[0]=start;
        result[1]=end;
        return result;
    }
}
