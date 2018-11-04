package com.revature.collection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaCollectionSolution implements JavaCollection {

	@Override
	public List<Integer> digits(int n) throws IllegalArgumentException {
		if(n <= 0) {
			throw new IllegalArgumentException();
		}

		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		int digit = 0;
		while(n > 10) {
			digit = n % 10;

			//updating the number
			n = n / 10;
			linkedList.addFirst(digit);
		}

		//get the last number
		linkedList.addFirst(n);

		return linkedList;
	}

	@Override
	public Set<?> sort(Object[] array) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean balancedBrackets(String brackets) throws IllegalArgumentException {
		if(brackets == null) {
			throw new IllegalArgumentException();
		}

		boolean balanced = false;

		if(brackets.isEmpty()) {
			balanced = true;
		}

		else if(brackets.length() % 2 != 0){
			return balanced;
		}

		else {
			HashMap<Character, Character> matchedBraces = new HashMap<Character, Character>();
			matchedBraces.put('{', '}');
			matchedBraces.put('(', ')');
			matchedBraces.put('[', ']');

			for(int i = 0; i < brackets.length()/2; i++) {
				
				/*
				 * Checking to see if the characters at both ends are actually braces
				 * 
				 */
				char leftCharacter = brackets.charAt(i);
				if(leftCharacter != '{' && leftCharacter != '(' && leftCharacter != '[') {
					return false;
				}

				char rightCharacter = brackets.charAt(brackets.length() - 1 - i);
				if(rightCharacter != '}' && rightCharacter != ')' && rightCharacter != ']') {
					return false;
				}
				
				if(rightCharacter != matchedBraces.get(leftCharacter)) {
					return false;
				}
			}

			balanced = true;
		}

		return balanced;
	}

	@Override
	public boolean isPalindrome(int n) throws IllegalArgumentException {
		if(n < 0) {
			throw new IllegalArgumentException();
		}

		boolean isPalindrome = false;

		LinkedList<Integer> linkedList = (LinkedList<Integer>) digits(n);

		if(linkedList.size() == 1) {
			isPalindrome = true;
		}

		else if(linkedList.size() == 2) {
			if(linkedList.peekFirst() == linkedList.peekLast()) {
				isPalindrome = true;
			}
		}

		else {
			for(int i = 0; i< linkedList.size()/2; i++) {
				int firstInt = linkedList.pollFirst();
				int lastInt = linkedList.pollLast();
				if(!(firstInt == lastInt)) {
					return isPalindrome;
				}

				else {
					isPalindrome = true;
				}
			}
		}

		return isPalindrome;
	}

	@Override
	public Map<Character, Integer> countCharacters(String string) throws IllegalArgumentException {
		if(string == null) {
			throw new IllegalArgumentException();
		}

		if(string.isEmpty()) {
			return new HashMap<Character, Integer>();
		}

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] chars = string.toCharArray();
		for(int i = 0; i < chars.length; i++) {
			Character curChar = chars[i];
			if(!hm.containsKey(curChar)) {
				hm.put(curChar, 1);
			}

			else {
				hm.put(curChar, hm.get(curChar) + 1);
			}
		}

		return hm;
	}
}
