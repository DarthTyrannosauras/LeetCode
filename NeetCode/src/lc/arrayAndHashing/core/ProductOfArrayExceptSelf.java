package lc.arrayAndHashing.core;

/*
 * LeetCode problem 238
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
 * 
 * Constraints:
 * 2 <= nums.length <= 10^5
 * -30 <= nums[i] <= 30
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * */

public interface ProductOfArrayExceptSelf {
	public static int[] productExceptSelf(int[] nums) {
        int[] prefixArray = new int[nums.length];
        int[] suffixArray = new int[nums.length];
        prefixArray[0] = 1;
        suffixArray[nums.length-1] = 1;
        for(int i = 1; i < nums.length; i++){
            prefixArray[i] = prefixArray[i-1] * nums[i-1];
            System.out.print(prefixArray[i] + " " );
        }
        System.out.println();
        for(int i = nums.length - 2; i >= 0; i--){
            suffixArray[i] = suffixArray[i+1] * nums[i+1];
            System.out.print(suffixArray[i] + " " );
        }
        for(int i = 0; i < prefixArray.length; i++){
            suffixArray[i] *= prefixArray[i];
        }
        return suffixArray;
    }
}
