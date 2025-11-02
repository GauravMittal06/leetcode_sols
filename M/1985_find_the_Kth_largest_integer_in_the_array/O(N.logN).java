import java.util.*;
import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (a, b) -> new BigInteger(a).compareTo(new BigInteger(b)));
        return String.valueOf(nums[nums.length-k]);
    }
}
