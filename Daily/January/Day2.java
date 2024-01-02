package lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 2610. Convert an Array Into a 2D Array With Conditions
 * You are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:

The 2D array should contain only the elements of the array nums.
Each row in the 2D array contains distinct integers.
The number of rows in the 2D array should be minimal.
Return the resulting array. If there are multiple answers, return any of them.

Note that the 2D array can have a different number of elements on each row.
 * */

public class Day2 {
	public static List<List<Integer>> findMatrix(int[] nums){
		//init
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		int maxCount = 1;//For #lists
		Map<Integer,Integer> numsMap = new HashMap<>();
		
		//Map Creation
		for(int i = 0; i < nums.length; i++) {
			if(numsMap.containsKey(nums[i])) {
				numsMap.put(nums[i], numsMap.get(nums[i]) + 1);
				if(numsMap.get(nums[i])>maxCount) {
					maxCount++;
				}
			}
			else {
				numsMap.put(nums[i], 1);
			}
		}
		
		//List<List<>> creation
		for(int i = 0; i < maxCount; i++) {
			res.add(new ArrayList<Integer>());
		}
		
		//Loop through map for inserting data into lists
		for(Map.Entry<Integer,Integer> entry: numsMap.entrySet()) {
			int element = entry.getKey();
			int count = entry.getValue();
			for(int i = 0; i < count; i++) {
				res.get(i).add(element);
			}
		} 
		
		return res;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,4,1,2,3,1};
		List<List<Integer>> res = findMatrix(nums);
		System.out.println(res);
		
	}

}
