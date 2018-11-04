package com.revature.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaCollectionSolutionDriver {

	public static void main(String[] args) {
		JavaCollectionSolution jcs = new JavaCollectionSolution();
		
		List<Integer> list = jcs.digits(13578); 
		for(int i : list) {
			System.out.println(i);
		}
		
		System.out.println(jcs.balancedBrackets("()"));
		System.out.println(jcs.balancedBrackets("{}"));
		System.out.println(jcs.balancedBrackets("[]"));
		System.out.println(jcs.balancedBrackets("{[]"));
		System.out.println(jcs.balancedBrackets("{[])"));
		System.out.println();
		
		System.out.println(jcs.isPalindrome(3));
		System.out.println(jcs.isPalindrome(22));
		System.out.println(jcs.isPalindrome(123));
		System.out.println(jcs.isPalindrome(12321));
		System.out.println();
		
		Map<Character, Integer> hashmap = jcs.countCharacters("revature");
		Set<Character> characters = hashmap.keySet();
		for(char c : characters) {
			System.out.println("character: " + c + " count: " + hashmap.get(c));
		}
	}

}
