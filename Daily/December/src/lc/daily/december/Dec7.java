package lc.daily.december;

public class Dec7 {

	public static String largestOddNumber(String num) {
        for(int i = num.length() - 1; i>=0; i--){
            if(Character.getNumericValue(num.charAt(i)) %2 !=0) {
            	return num.substring(0, i+1);
            }
        }
        return "";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numStr = "52";
		System.out.println(largestOddNumber(numStr));
	}

}
