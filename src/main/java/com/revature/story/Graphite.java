package com.revature.story;

public class Graphite extends WritingTool implements Writable {
	
	//in percentage
	private double graphiteAmountRemaining;
	//in cm
	private double bodyLength;
	private boolean hasClip;
	
	public Graphite() {
		super();
	}
	
	public Graphite(String name, double tipSize, String color) {
		super(name, tipSize, color);
	}
	
	public Graphite(double graphiteRemaining, double bodyLength, boolean hasClip) {
		this.graphiteAmountRemaining = graphiteRemaining;
		this.bodyLength = bodyLength;
		this.hasClip = hasClip;
	}

	public Graphite(String name, double tipSize, String color, double graphiteRemaining, double bodyLength, boolean hasClip) {
		super(name, tipSize, color);
		this.graphiteAmountRemaining = graphiteRemaining;
		this.bodyLength = bodyLength;
		this.hasClip = hasClip;
	}

	public double getGraphiteAmountRemaining() {
		return graphiteAmountRemaining;
	}

	public void setGraphiteAmountRemaining(double graphiteAmountRemaining) {
		this.graphiteAmountRemaining = graphiteAmountRemaining;
	}

	public double getBodyLength() {
		return bodyLength;
	}

	public void setBodyLength(double newBodyLength) {
		this.bodyLength = newBodyLength;
	}

	public boolean hasClip() {
		return hasClip;
	}

	public void setHasClip(boolean hasClip) {
		this.hasClip = hasClip;
	}
	
	@Override
	public void write() {
		System.out.println("I use graphite to write.");
	}
}
