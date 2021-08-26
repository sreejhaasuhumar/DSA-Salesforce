package Salesforce;

public class SmallestDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]  nums = {1,2,5,9};
int threshold = 6;
int ans =smallestDivisor(nums,threshold);
System.out.println(ans);
	}
	
	 public static int smallestDivisor(int[] nums, int threshold) {
	      int left = 1, right = (int)1e6;
	        while (left < right) {
	            int m = (left + right) / 2, sum = 0;
	            for (int i : nums)
	                sum += (i + m - 1) / m;
	            if (sum > threshold)
	                left = m + 1;
	            else
	                right = m;
	        }
	        return left;  
	    }

}
