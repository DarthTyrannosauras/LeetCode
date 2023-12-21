package lc.daily.december;

import java.util.HashMap;
import java.util.Map;

public class Dec2 {
	
	public static int countCharacters(String[] words, String chars) {
		Map<Character,Integer> stringMap = new HashMap<>();
		Map<Character,Integer> wordMap = new HashMap<>();
		boolean isGoodString = true;
		int length = 0;
		StringBuilder s1 = new StringBuilder();
		for(int i = 0; i < chars.length(); i++) {
			if(stringMap.containsKey(chars.charAt(i)))
				stringMap.put(chars.charAt(i), stringMap.get(chars.charAt(i)) + 1);
			else
				stringMap.put(chars.charAt(i), 1);
		}
		
		for(int i = 0; i < words.length; i++) {
			isGoodString = true;
			wordMap.clear();
			s1.delete(0, s1.length()+1);
			for(int j = 0; j < words[i].length(); j++) {
				if(wordMap.containsKey(words[i].charAt(j)))
					wordMap.put(words[i].charAt(j), wordMap.get(words[i].charAt(j)) + 1);
				else {
					wordMap.put(words[i].charAt(j), 1);
					s1.append(words[i].charAt(j));
				}
			}
			for(int j = 0; j < s1.length(); j++) {
				
				if(!stringMap.containsKey(s1.charAt(j))) { 
					isGoodString = false; 
					break;
				}
				
				if(wordMap.get(s1.charAt(j)) > stringMap.get(s1.charAt(j))) {
					isGoodString = false;
					break;
				}
			}
			if(isGoodString)
				length += words[i].length();
		}
		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"cat","bt","hat","tree"};
		String chars = "atach";
		int goodStringLength = countCharacters(words, chars);
		System.out.println("Length: " + goodStringLength);

	}

}
