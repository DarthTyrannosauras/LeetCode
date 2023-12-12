package lc.arrayAndHashing.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*
 * Q: How to populate List<List<String>> groupAnagramList???
 * */


/*
 * LeetCode problem 49
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
 * typically using all the original letters exactly once.
 * */

/*
 * Example:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * */

public interface GroupAnagram {
	
	public static List<List<String>> groupAnagrams1(String[] strs){
		HashMap<Double, List<String>> stringListMap  = new HashMap<>();
		for(String s: strs) {
			double num = alphaSum(s);
			List<String> res = new ArrayList<String>();
			if(stringListMap.containsKey(num)) {
				res= stringListMap.get(num);
			}
			res.add(s);
			stringListMap.put(num, res);
			}	
		return new ArrayList<List<String>>(stringListMap.values());
	}
	public static double alphaSum(String s) {
		// TODO Auto-generated method stub
		int[] alphaToNum = {3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
		double res=1;
		for(int i=0;i<s.length();i++) {
			int index = s.charAt(i)- 'a';
			res = res*alphaToNum[index];
		}
		return res;
	}
	
	public static List<List<String>> groupAnagrams2(String[] strs) {
		
		List<List<String>> groupAnagramList = new ArrayList<List<String>>();
		
		//If empty string, return empty List
		if(strs.length==0)
			return groupAnagramList;
		List<String> stringList = new ArrayList<String>();
		//If only one string, return the list with 1 string.
		if(strs.length==1) {
			stringList.add(strs[0]);
			groupAnagramList.add(stringList);
			return groupAnagramList;
		}
		
		//Create 2 maps. One for checking if anagram and one for re-initialization of HashMap for next string
		Map<Character, Integer> charMap = new HashMap<>();
		Map<Character, Integer> charMapStore = new HashMap<>();
		boolean nextString=false;
		
		//Iterate through String Array
		for(int i=0;i<strs.length;i++) {
			//Check for anagrams only if current String is not null
			if(strs[i]!=null) {
				String currentString = strs[i];
				stringList.add(currentString);
				
				//Making 2 maps for current String
				for(int j=0; j<currentString.length();j++) {
					char key =currentString.charAt(j);
					if(charMap.containsKey(key)) {
						int value = charMap.get(key);
						charMap.put(key, value + 1);
						charMapStore.put(key, value + 1);
					}
					else {
						charMap.put(key, 1);
						charMapStore.put(key, 1);
					}
				}
				
				//Go through all next non-null and same-length strings after current string to check for Anagrams
				for(int j=i+1;j<strs.length;j++) {
					if(strs[j]!=null && currentString.length()==strs[j].length()) {
						String checkString = strs[j];
						//If key is not available, not an anagram, go directly to next string. Else decrease count for the characters 
						for(int k=0;k<checkString.length();k++) {
							char key =checkString.charAt(k);
							if(charMap.containsKey(key))
								charMap.put(key, charMap.get(key)-1);
							else {
								nextString=true;
								break;
							}
						}
						//Skip to next string
						if(nextString) {
							nextString=false;
							charMap.putAll(charMapStore);
							continue;}
						//If there is non-zero value in charMap, then not an anagram. Reinit charMap and go to next string.
						if(charMap.values().stream().allMatch(val->val.equals(0))) {
							strs[j]=null;
							stringList.add(checkString);
							charMap.putAll(charMapStore);
						}
						else {
							charMap.putAll(charMapStore);
							continue;
						}
					}
				}
				//A round of all strings is completed. Now add the list of anagrams to group.
				groupAnagramList.add(new ArrayList<String>(stringList));
				stringList.clear();
				charMap.clear();
				charMapStore.clear();
			}
		}
		//All Strings completed. Return group of Anagram.
		return groupAnagramList;
	}
}
