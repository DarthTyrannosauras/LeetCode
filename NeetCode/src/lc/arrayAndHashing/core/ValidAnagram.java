package lc.arrayAndHashing.core;

/*
 * LeetCode problem 242
 *Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
 *typically using all the original letters exactly once. 
 * */

import java.util.HashMap;
import java.util.Map;

public interface ValidAnagram {
	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		Map<Character, Integer> charMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (charMap.containsKey(s.charAt(i)))
				charMap.put(s.charAt(i), charMap.get(s.charAt(i)) + 1);
			else
				charMap.put(s.charAt(i), 1);
		}
		/*System.out.println("Original:");
		charMap.entrySet().stream().forEach(set -> System.out.println(set));*/
		for (int i = 0; i < t.length(); i++) {
			if (charMap.containsKey(t.charAt(i)))
				charMap.put(t.charAt(i), charMap.get(t.charAt(i)) - 1);
			else
				return false;
		}
		/*System.out.println("After check");
		charMap.entrySet().stream().forEach(set -> System.out.println(set));*/
		for (int i = 0; i < s.length(); i++) {
			if (charMap.get(s.charAt(i)) != 0)
				return false;
		}
		return true;
	}

}
