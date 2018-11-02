package com.revature.collection;

import java.util.List;

public class JavaCollectionDriver {

	public static void main(String[] args) {
		JavaCollectionSolution jss = new JavaCollectionSolution();
		
		List<Integer> list = jss.digits(13578); 
		for(int i : list) {
			System.out.println(i);
		}
	}

}
