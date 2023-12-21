package bs.searchInArray;

/* 34. Find First and Last Position of Element in Sorted Array
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity
 * */
public class FirstAndLastPosition {

	public int[] searchRange(int[] nums, int target) {
        int lastPos = 0;
		int firstPos = 0;
		int low = 0;
		int high = nums.length - 1;
        int[] resultArr = {-1,-1};
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(nums[mid] == target) {
                firstPos = mid;
                lastPos = mid;	
				for(int i = mid + 1; i <= nums.length - 1; i++) {
					if(nums[i]==nums[mid])
						lastPos = i;
					else {
						break;
					} 
				}
                for(int i = mid - 1; i >= 0; i--) {
					if(nums[i]==nums[mid])
						firstPos = i;
					else {
						break;
					} 
				}
                resultArr[0] = firstPos;
                resultArr[1] = lastPos;
                return resultArr;
			} 
			if(nums[mid] > target) {
				lastPos = mid;
				high = mid - 1;
			}
	        if(nums[mid] < target) {
	        	low = mid + 1;
	        }
		}
        return resultArr;
    }
	/*Should be implemented as below:*/
	private static int findFirst(int[] nums, int target){
	    int idx = -1;
	    int start = 0;
	    int end = nums.length - 1;
	    while(start <= end){
	        int mid = (start + end) / 2;
	        if(nums[mid] >= target){
	            end = mid - 1;
	        }else{
	            start = mid + 1;
	        }
	        if(nums[mid] == target) idx = mid;
	    }
	    return idx;
	}

	private static int findLast(int[] nums, int target){
	    int idx = -1;
	    int start = 0;
	    int end = nums.length - 1;
	    while(start <= end){
	        int mid = (start + end) / 2;
	        if(nums[mid] <= target){
	            start = mid + 1;
	        }else{
	            end = mid - 1;
	        }
	        if(nums[mid] == target) idx = mid;
	    }
	    return idx;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
