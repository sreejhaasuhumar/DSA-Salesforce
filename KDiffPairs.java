package Salesforce;

import java.util.HashSet;
import java.util.Set;

public class KDiffPairs {
/*Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

0 <= i < j < nums.length
|nums[i] - nums[j]| == k
Notice that |val| denotes the absolute value of val.

 

Example 1:

Input: nums = [3,1,4,1,5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {3,1,4,1,5};
		int k = 2;
		int ans=findPairs(nums,k);
		System.out.println(ans);
	}
	
	public static int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        Set<Integer> numbers = new HashSet<>();
        Set<Integer> found = new HashSet<>();
        for (int n : nums) {
            if (numbers.contains(n + k)) found.add(n);
            if (numbers.contains(n - k)) found.add(n - k);
            numbers.add(n);
        }
        return found.size();
    }

}
