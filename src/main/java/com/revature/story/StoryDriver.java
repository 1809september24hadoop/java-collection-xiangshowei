package com.revature.story;

import com.revature.exceptions.NoBullyingException;
import com.revature.exceptions.NotAPencilException;
import com.revature.exceptions.RanOutOfInkException;

public class StoryDriver {
	/**
	 * This is a free will assignment for you to have fun with what we have learned.
	 * 
	 * I want you to tell me a story using the following things:
	 * 
	 * 1) Your own protagonist POJO:
	 * 	- Provide three attributes to this POJO 
	 * 	- two overloaded constructors besides the no args constructor.
	 * 
	 * - Feel free to add more characters to your story.
	 * 
	 * 2) An Interface and an Abstract Class which your POJO(s) will implement and/or extend.
	 * 
	 * - Add some fun methods in there.
	 * 
	 * 3) Two custom exceptions: 
	 * 		one extending from Exception 
	 * 		the other one extending from RuntimeException. 
	 * 
	 * These will be thrown in the story.
	 * 
	 * In the main method is where you tell the story. You can create as many instances
	 * (characters) as you need, but make you sure you present them into the console before
	 * starting the story.
	 * 
	 * Remember, I want you to have fun, BUT AS ALWAYS... Keep it professional.
	 * 
	 * Credit goes to Sarah Faust for brainstorming
	 * 
	 **/

	public static void main(String[] args) {
		WritingTool[] pencilCase = new WritingTool[3];

		Graphite pencil = new Graphite("pencil", 0.5, "orange", 100, 20, false);
		Graphite mechanicalPencil = new Graphite("mechanical pencil",0.5, "gray", 100, 18, true);
		Ink fountainPen = new Ink("fountain pen", 0.3, "black", 100, 17, true);
		Sharpener sharpener = new Sharpener("sharpener", 1);

		pencilCase[0] = pencil;
		pencilCase[1] = mechanicalPencil;
		pencilCase[2] = fountainPen;

		System.out.println("Somewhere in the universe there existed a pencil case.");
		System.out.println("Inside there were " + pencilCase.length + " writing tools.");
		System.out.println("They were a " + pencil.getName() + ", " + mechanicalPencil.getName() + ", and a " + fountainPen.getName() + ".");
		System.out.println("The " + fountainPen.getName() + " was a favorite among the writing tools due to its unltra-fine " 
				+ fountainPen.getTipSize() + " tip.");
		System.out.println("Letting the popularity get to its head, it felt like it had the right to bully the " + pencil.getName() + ".");

		System.out.println();
		try {
			fountainPen.bully(pencil);
		} catch (NoBullyingException nbe) {	
			System.out.println(nbe);
		}
		System.out.println();

		System.out.println(" \"I'm not sure I'll last enough for the assingment because I have only have " + 
				pencil.getGraphiteAmountRemaining() + "% graphite left in me...\" ");
		System.out.println(" \"Hey, do you want to get better?\" the " + sharpener.getName() + " chimed in.");
		System.out.println(" \"But wouldn't that require me to lose more of my graphite?\"  ");
		System.out.println(" \"Yes but that will be put to good use.\"");

		sharpener.sharpen(pencil, 0.3);

		System.out.println(" \"Would you look at that,\" said the mechanical pencil. \"Let me give it a spin.\"");

		System.out.println();
		try {
			sharpener.sharpen(mechanicalPencil, 0.3);
		} catch (NotAPencilException nape) {
			System.out.println(nape);
		}
		System.out.println();

		System.out.println(" \"Sorry bud, pencils only.");
		System.out.println("The " + fountainPen.getName() + 
				"might be popular but it doesn't last long. Take a look for yourself.\" ");

		fountainPen.setInkAmountRemaining(0);

		System.out.println();
		try {
			fountainPen.write();
		} catch (RanOutOfInkException rooie) {
			System.out.println(rooie);
		}
		System.out.println();

		System.out.println("\"While you were busy basking in your ego, I took the time to improve myself. "
				+ "And now I hava a " + pencil.getTipSize() + " tip. \n" +  
				"Just because I started out with a thicker tip doesn't mean I can't get better. \n"
				+ "You might start out with a good tip size but that's going to remain static while I improved.\"");
	}	
}




