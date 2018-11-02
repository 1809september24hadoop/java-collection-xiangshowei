package com.revature.collection;

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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPalindrome(int n) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<Character, Integer> countCharacters(String string) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

}
