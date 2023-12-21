package lc.arrayAndHashing.tester;
import static lc.arrayAndHashing.core.TwoSum.twoSum1;

public class TwoSumTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numAray= {0,4,3,0};
		int target = 0;
		int[] indexArray = twoSum1(numAray, target);
		System.out.println("Twosum indices: " +indexArray[0] +" " + indexArray[1]);
	}

}
