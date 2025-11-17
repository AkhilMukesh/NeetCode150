package neetcode;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagrams {
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagrama";
		
		
		//brute force
		boolean bruteForceResult = bruteForceResult(s, t);
		System.out.println(bruteForceResult);
		
		//optimal1 
		 boolean optimalOneResult = optimalOne(s, t);
		System.out.println(optimalOneResult);
		
		//optimal2
		boolean optimal2result = validAnagram(s,t);
		System.out.println(optimal2result);
	}

	private static Boolean optimalOne(String s, String t) {
		if(s.length()!=t.length()){
			return false;
		}
		
		HashMap<Character,Integer> sMap = new HashMap<>();
		HashMap<Character, Integer> tMap = new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),0)+1);
			tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i),0)+1);
		}
		
		return sMap.equals(tMap);
	}

	private static boolean bruteForceResult(String s, String t) {
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
		
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		return Arrays.equals(sArray, tArray);
	}

	private static boolean validAnagram(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		
		
		int[] count = new int[26];
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)-'a']++;
			count[t.charAt(i)-'a']--;
		}
		
		for(int val: count) {
			if(val!=0) {
				return false;
			}
		}
		return true;
	}

}
