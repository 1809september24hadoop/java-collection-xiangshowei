package com.revature.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaCollectionSolutionDriver {

	public static void main(String[] args) {
		JavaCollectionSolution jss = new JavaCollectionSolution();
		
		List<Integer> list = jss.digits(13578); 
		for(int i : list) {
			System.out.println(i);
		}
		
		System.out.println(jss.isPalindrome(3));
		System.out.println(jss.isPalindrome(22));
		System.out.println(jss.isPalindrome(123));
		System.out.println(jss.isPalindrome(12321));
		
		Map<Character, Integer> hashmap = jss.countCharacters("revature");
		Set<Character> characters = hashmap.keySet();
		for(char c : characters) {
			System.out.println("character: " + c + " count: " + hashmap.get(c));
		}
	}

}
