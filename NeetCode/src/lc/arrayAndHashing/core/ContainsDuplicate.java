
/*
 * LeetCode problem 217
 * Given an integer array nums, return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 * */
package lc.arrayAndHashing.core;
import java.util.HashSet;
import java.util.Set;

public interface ContainsDuplicate {
	// Using brute force method. O(n2)
	public static boolean containsDuplicate1(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j])
					return true;
			}
		}
		return false;
	}

		
	public static boolean containsDuplicate2(int[] nums) {
		Set<Integer> numSet = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			numSet.add(nums[i]);
		}
		if (nums.length == numSet.size())
			return false;
		return true;
	}

	public static boolean containsDuplicate3(int[] nums) {
		Set<Integer> numSet = new HashSet<>();
		if (nums.length <= 1)
			return false;
		for (int i = 0; i < nums.length; i++) {
			if (numSet.contains(nums[i])) {
				return true;
			}
			numSet.add(nums[i]);
		}
		return false;
	}

}
