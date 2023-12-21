package lc.arrayAndHashing.tester;
import java.util.ArrayList;
import java.util.List;
import static lc.arrayAndHashing.core.EncodeAndDecodeString.*;
public class EncodeDecodeStringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<>();
		strList.add("Hello");
		strList.add("There");
		strList.add("General");
		strList.add("Kenobi");
		String encodedStr = encode(strList);
		System.out.println("Encoded string: " + encodedStr);
		System.out.println("Decoded string: " + decode(encodedStr));
	}

}
