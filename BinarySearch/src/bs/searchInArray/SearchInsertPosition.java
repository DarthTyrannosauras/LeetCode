package bs.searchInArray;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        return searchInsert(nums, target, 0, nums.length - 1);
    }

    private static int searchInsert(int[] nums, int target, int low, int high){
        int mid = low + (high-low)/2;
        if(high < low){
            return low;
        }
        if(nums[mid] == target) return mid;
        if(nums[mid] > target) return searchInsert(nums, target, low, mid - 1);
        if(nums[mid] < target) return searchInsert(nums, target, mid + 1, high);
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numsArr = {2,3,5,6,7,8,10};
		int target = 13;
		System.out.println(searchInsert(numsArr, target));
	}
}
