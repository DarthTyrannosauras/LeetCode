package lc.arrayAndHashing.tester;

public class RecursionTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(0,1,10));
	}
public static int fibonacci(int pp, int p, int toIndex) {
	if(toIndex==1)
		return p;
	return fibonacci(p,p+pp,--toIndex);
}
}
