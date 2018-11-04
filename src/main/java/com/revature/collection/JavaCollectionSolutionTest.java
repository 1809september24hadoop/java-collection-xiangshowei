package com.revature.collection;

import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class JavaCollectionSolutionTest {
	
	private JavaCollectionSolution jss;
	
	@Before
	public void setUp() {
		jss = new JavaCollectionSolution();
	}
	
	@Test
	public void testDigits() {
		LinkedList<Integer> list = (LinkedList<Integer>) jss.digits(13578); 
		assertTrue("incorrect list size", list.size() == 5);
		for(int i = 0; i < list.size(); i++) {
			int digit = list.pollFirst();
			
			if(i == 0) {
				assertTrue("first digit was 1", digit == 1);
			}
			
			else if (i == 1) {
				assertTrue("second digit was 3", digit == 3);
			}
			
			else if (i == 2) {
				assertTrue("third digit was 3", digit == 5);
			}
			
			else if (i == 3) {
				assertTrue("fourth digit was 3", digit == 7);
			}
			
			else if (i == 4) {
				assertTrue("fifth digit was 3", digit == 8);
			}
		}
	}
}
