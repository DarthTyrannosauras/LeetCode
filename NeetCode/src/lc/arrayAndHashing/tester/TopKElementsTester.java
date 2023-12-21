package lc.arrayAndHashing.tester;
import static lc.arrayAndHashing.core.TopKFrequentElements.topKFrequent;

public class TopKElementsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,1,-1,2,-1,2,3};
		int k =2;
		int[] frequentElements = topKFrequent(nums, k);
		for(int i=0;i<frequentElements.length;i++) {
			System.out.print(frequentElements[i] +" ");
		}
	}

}
