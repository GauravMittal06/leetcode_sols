class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;

            //find the pivot
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }
            //if the array is at its largest lexicographic state, return the 1st permutation of the array (ascending sorted array)
        if(index==-1)
        {
            for(int i=0;i<nums.length/2;i++)
            {
                int temp=nums[i];
                nums[i]=nums[nums.length-i-1];
                nums[nums.length-i-1]=temp;
            }
            return;
        }

            //swap the pivot and its smallest greater predecessor on the right
            //always the 1st element greater than the 'index' element because the elements post index are already sorted in descending order
        int l=nums.length-1;
        int swapEle=-1;
        while(l>index)
        {
            if(nums[l]>nums[index])
            {
                swapEle=l;
                break;
            }
            l--;
        }

        int temp1=nums[index];
        nums[index]=nums[swapEle];
        nums[swapEle]=temp1;

            //reverse the array from the index i+1 to end
        int start=index+1;
        int end=nums.length-1;
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;

            start++;
            end--;
        }
    }
}
