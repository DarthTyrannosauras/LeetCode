package lc.daily.december;

public class Dec1 {

	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		for(int i = 0; i < word1.length; i++)
			s1.append(word1[i]);
		for(int i = 0; i < word2.length; i++)
			s2.append(word2[i]);
		if(s1.length()!=s2.length())
			return false;
		for(int i=0; i < s1.length(); i++)
			if(s1.charAt(i)!=s2.charAt(i))
				return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] sArray1 = {"abc", "d", "defg"};
		String[] sArray2 = {"abcddefg"};
		
		System.out.println("Array1, Array2 :" + arrayStringsAreEqual(sArray1, sArray2));
		
	}

}
