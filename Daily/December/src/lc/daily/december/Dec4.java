package lc.daily.december;

/* 2264. Largest 3-Same-Digit Number in String
 * 
 * You are given a string num representing a large integer. 
 * An integer is good if it meets the following conditions:
 * 
 * It is a substring of num with length 3. It consists of only one unique digit.
 * 
 * Return the maximum good integer as a string or an empty string "" if no such integer exists.
 * 
 * Note:
 * A substring is a contiguous sequence of characters within a string.
 * There may be leading zeroes in num or a good integer.
 * */

public class Dec4 {

	public static String largestGoodInteger(String num) {
        int[] numsArr = new int[10];
        for(int i = 0; i < num.length()-2; i++){
            if(num.charAt(i)==num.charAt(i + 1) && num.charAt(i + 1)==num.charAt(i + 2))
                numsArr[Character.getNumericValue(num.charAt(i))] = 1;
        }
        
        StringBuilder s1 = new StringBuilder();
        for(int i = 9; i >= 0; i--){
            if(numsArr[i]==1){
                s1.append(i);
                s1.append(i);
                s1.append(i);
                return s1.substring(0);
            }
        }
        return "";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numsString = "42352338";
		System.out.println(largestGoodInteger(numsString));
	}

}
