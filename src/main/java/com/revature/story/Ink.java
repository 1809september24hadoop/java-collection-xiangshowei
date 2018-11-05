package com.revature.story;

import java.util.Random;

import com.revature.exceptions.NoBullyingException;
import com.revature.exceptions.RanOutOfInkException;

public class Ink extends WritingTool implements Writable {
	
	//in percentage
	private double inkAmountRemaining;
	//in cm
	private int barrelLength;
	private boolean hasCap;
	
	public Ink() {
		super();
	}
	
	public Ink(String name, double tipSize, String color) {
		super(name, tipSize, color);
	}

	public Ink(double inkAmountRemaining, int barrelLength, boolean hasClip) {
		super();
		this.inkAmountRemaining = inkAmountRemaining;
		this.barrelLength = barrelLength;
		this.hasCap = hasClip;
	}

	public Ink(String name,double tipSize, String color, double inkAmountRemaining, int barrelLength, boolean hasClip) {
		super(name, tipSize, color);
		this.inkAmountRemaining = inkAmountRemaining;
		this.barrelLength = barrelLength;
		this.hasCap = hasClip;
	}
	
	public double getInkAmountRemaining() {
		return inkAmountRemaining;
	}

	public void setInkAmountRemaining(double newInkAmount) {
		inkAmountRemaining = newInkAmount;
	}

	public int getBarrelLength() {
		return barrelLength;
	}

	public void setBarrelLength(int barrelLength) {
		this.barrelLength = barrelLength;
	}

	public boolean hasCap() {
		return hasCap;
	}

	public void setHasCap(boolean hasCap) {
		this.hasCap = hasCap;
	}
	
	public void bully(Graphite graphite) throws NoBullyingException {
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(30);
		
		graphite.setGraphiteAmountRemaining(randomNumber);
		throw new NoBullyingException("No bullying allowed while you're under my roof!");
	}

	@Override
	public void write() throws RanOutOfInkException {
		if(inkAmountRemaining == 0) {
			throw new RanOutOfInkException("\"Oh no! I ran out of ink!\"");
		}
		
		System.out.println("I use ink to write.");
	}
}
