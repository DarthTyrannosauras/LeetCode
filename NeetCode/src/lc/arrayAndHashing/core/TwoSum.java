package lc.arrayAndHashing.core;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode problem 1
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * */

public interface TwoSum {
	public static int[] twoSum1(int[] nums, int target) {
		int[] index = new int[2];
		if (nums.length == 2)
			if ((nums[0] + nums[1]) == target) {
				index[0] = 0;
				index[1] = 1;
				return index;
			}
		int requiredElement /* , currentElement */;
		for (int i = 0; i < nums.length; i++) {
			// currentElement = nums[i];
			requiredElement = target - nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == requiredElement) {
					index[0] = i;
					index[1] = j;
					return index;
				}
			}
		}
		return index;
	}

	public static int[] twoSum2(int[] nums, int target) {
		int[] index = new int[2];
		if (nums.length == 2)
			if ((nums[0] + nums[1]) == target) {
				index[0] = 0;
				index[1] = 1;
				return index;
			}
		// Map consisting of array element as key and index as value:
		Map<Integer, Integer> numsMap = new HashMap<>();
		/*
		 * There is only a unique solution to the sum. If the sum is made of 2 repeating
		 * element, sum has to be checked before adding the element to the map. If the
		 * sum is not made of repeating elements, check if there exists a key that is
		 * equal to target - current Array Element. If above condition met, return
		 * indices.
		 */
		for (int i = 0; i < nums.length; i++) {
			if (numsMap.containsKey((target - nums[i]))) {
				index[0] = numsMap.get((target - nums[i]));
				index[1] = i;
				return index;
			} else
				numsMap.put(nums[i], i);
		}
		return index;
	}
}
