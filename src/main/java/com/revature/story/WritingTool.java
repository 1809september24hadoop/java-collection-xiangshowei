package com.revature.story;

public abstract class WritingTool implements Writable, Comparable<WritingTool> {

	private String name;
	private double tipSize;
	private String color;

	public WritingTool() {
		this("generic writing tool", 0.5, "gray");
	}

	public WritingTool(String name, double tipSize, String color) {
		this.name = name;
		this.tipSize = tipSize;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public double getTipSize() {
		return tipSize;
	}

	public void setTipSize(double newTipSize) {
		tipSize = newTipSize;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String newColor) {
		color = newColor;
	}

	@Override
	public int compareTo(WritingTool o) {
		if(tipSize > o.getTipSize()) {
			return 1;
		}

		else if(tipSize < o.getTipSize()) {
			return -1;
		}

		else {
			return 0;
		}
	}
}
