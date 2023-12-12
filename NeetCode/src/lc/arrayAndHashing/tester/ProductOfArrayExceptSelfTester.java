package lc.arrayAndHashing.tester;
import static lc.arrayAndHashing.core.ProductOfArrayExceptSelf.productExceptSelf;
public class ProductOfArrayExceptSelfTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1, 2, 3, 4};
		int[] nums2 = {-1, 1, 0, -3, 3};
		int[] productArray = productExceptSelf(nums1);
		for(int i=0;i<productArray.length;i++) {
			System.out.print(productArray[i] + " ");
		}
		/*System.out.println();
		productArray = productExceptSelf(nums2);
		for(int i=0;i<productArray.length;i++) {
			System.out.print(productArray[i] + " ");
		}*/
	}

}
