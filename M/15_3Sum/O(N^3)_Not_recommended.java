import java.util.*; //BAD TIME COMPLEXITY: O(N^3)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> listOfLists = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                        List<Integer> listOfIntegers = new ArrayList<>();
                        listOfIntegers.add(nums[i]);
                        listOfIntegers.add(nums[j]);
                        listOfIntegers.add(nums[k]);
                        Collections.sort(listOfIntegers);

                        listOfLists.add(listOfIntegers);
                    }
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>(listOfLists);
        return result;
    }
}
