import java.util.*;
import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (a, b) -> new BigInteger(a).compareTo(new BigInteger(b))); //using BigInteger for using large (18+) digits
        return String.valueOf(nums[nums.length-k]);
    }
}
