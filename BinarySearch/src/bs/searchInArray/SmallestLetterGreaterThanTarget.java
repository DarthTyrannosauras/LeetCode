package bs.searchInArray;

public class SmallestLetterGreaterThanTarget {
	
	public static char nextGreatestLetter(char[] letters, char target) {
		int low = 0;
		int high = letters.length - 1;
		int ans = 0;
		if(target >= letters[high])
			return letters[ans];
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(letters[mid] == target) {	
				for(int i = mid + 1; i <= letters.length - 1; i++) {
					if(i==letters.length - 1 && letters[i]==mid) 
						return letters[0];
					if(letters[i]==letters[mid])
						continue;
					else 
						return letters[i];
				}
			} 
			if(letters[mid] > target) {
				ans = mid;
				high = mid - 1;
			}
	        if(letters[mid] < target) {
	        	low = mid + 1;
	        }
		}
        return letters[ans];
    }
	/*private static int requiredIndex(char[] letters, char target, int low, int high) {
		int mid = low + (high-low)/2;
		
		if(Character.getNumericValue(letters[mid]) == Character.getNumericValue(target)) return mid + 1;
		if(Character.getNumericValue(letters[mid]) > Character.getNumericValue(target)) return requiredIndex(letters, target, low, mid - 1);
        if(Character.getNumericValue(letters[mid]) < Character.getNumericValue(target)) return requiredIndex(letters, target, mid + 1, high);
        return -1;
	}*/
	/*private static int requiredIndex(char[] letters, char target, int low, int high) {
		int mid = low + (high-low)/2;
        if(Character.getNumericValue(letters[mid]) == Character.getNumericValue(target)) return mid + 1;
        if(mid==low) {
        	if(low == letters.length - 1)
        		return 0;
        	return mid;
        }
        if(Character.getNumericValue(letters[mid]) > Character.getNumericValue(target)) return requiredIndex(letters, target, low, mid - 1);
        if(Character.getNumericValue(letters[mid]) < Character.getNumericValue(target)) return requiredIndex(letters, target, mid + 1, high);
        return -1;
    }*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] letters = {'x','x','y','y'};
		char target = 'z';
		char nextChar = nextGreatestLetter(letters, target);
		System.out.println("Char greater than " + target + " is " + nextChar);
	}

}
