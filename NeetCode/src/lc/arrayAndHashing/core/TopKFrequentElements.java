package lc.arrayAndHashing.core;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Given an integer array nums and an integer k, return the k most frequent elements. 
 * You may return the answer in any order.
 * 1 <= nums.length <= 10^5
 * -10^4 <= nums[i] <= 10^4
 * k is in the range [1, the number of unique elements in the array].
 * It is *guaranteed* that the answer is unique.
 * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 * */


/*
 * Revisit problem after priority queue to reduce Runtime???
 * */
public interface TopKFrequentElements {
	public static int[] topKFrequent(int[] nums, int k) {
		int[] topKElements = new int[k];
		// Converting to Map
		Map<Integer, Integer> numsMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (numsMap.containsKey(nums[i]))
				numsMap.put(nums[i], numsMap.get(nums[i]) + 1);
			else
				numsMap.put(nums[i], 1);
		}
		Map<Integer, Integer> orderedSortedNumsMap = new LinkedHashMap<>();
		numsMap.entrySet().stream().forEach(e -> System.out.println("Key: " + e.getKey() + " ,Value: " + e.getValue()));
		int count = 0;

		/*orderedSortedNumsMap = numsMap.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));*/
		orderedSortedNumsMap = numsMap.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		/*orderedSortedNumsMap.entrySet().stream()
				.forEach(e -> System.out.println("Key: " + e.getKey() + " ,Value: " + e.getValue()));*/
		for (Integer key : orderedSortedNumsMap.keySet()) {
			topKElements[count++] = key;
			System.out.println(key);
			if (count == k)
				break;
		}
		return topKElements;
	}
}
