package lc.arrayAndHashing.tester;
import static lc.arrayAndHashing.core.GroupAnagram.groupAnagrams1;

import java.util.List;

public class GroupAnagramTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
		String[] strs2 = {""};
		//String[] strs3 = {"a"};
		List<List<String>> strList = groupAnagrams1(strs1);
		strList.forEach(sl->System.out.println(sl));
		strList.forEach(sL->{sL.forEach(s->System.out.print(s + " "));System.out.println();});
		strList=groupAnagrams1(strs2);
		strList.forEach(sL->sL.forEach(s->System.out.println(s)));
		/*strList=groupAnagrams(strs3);
		strList.forEach(sL->sL.forEach(s->System.out.println(s)));*/

	}

}
