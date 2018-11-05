package com.revature.story;

import com.revature.exceptions.NotAPencilException;

public class Sharpener {

	private String name;
	private int numOpenings;

	public Sharpener(String name, int numOpenings) {
		this.name = name;
		this.numOpenings = numOpenings;
	}

	public int getNumOpenings() {
		return numOpenings;
	}

	public String getName() {
		return name;
	}

	public void sharpen(Graphite graphite, double amountToShave){
		if(graphite.hasClip()) {
			throw new NotAPencilException("Fatal error. Pencil not detected. " 
					+ "Only pencils can use a sharpener");
		}

		graphite.setTipSize((graphite.getTipSize() - amountToShave));
	}

}
