package Salesforce;

import java.util.HashMap;

public class ContiguousSubarraySum {
/*
 * Given an integer array nums and an integer k, return true if nums has a continuous subarray of size at least two whose elements sum up to a multiple of k, or false otherwise.

An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
 Input: nums = [23,2,4,6,7], k = 6
Output: true
Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
 */
	public static void main(String[] args) {

		int[] nums= {23,2,4,6,7};
		int k=13;
		boolean b=checkSubarraySum(nums,k);
		System.out.println(b);
	}
	
	 public static boolean checkSubarraySum(int[] nums, int k) {
		 HashMap<Integer,Integer> map = new HashMap<>();
	        long sum=0;
	        map.put(0,-1); // base case no sum at -1 position
	        for(int i=0;i<nums.length;i++){
	            sum+=nums[i];
	            int key = (int)sum%k;
	            if(map.containsKey(key)){
	                // System.out.println(i + " "+key);
	                // subArray size greater than 1 
	                if(i-map.get(key)>1)
	                    return true;
	            }
	            else
	                map.put(key,i);
	        }
	        return false;
	        
	    }

}
