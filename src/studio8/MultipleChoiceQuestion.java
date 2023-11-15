package studio8;

import java.util.Scanner;

public class SelectAllQuestion extends MultipleChoiceQuestion{

	public SelectAllQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points, choices);
		
		
	}
	public void displayPrompt() {
		System.out.println(this.getPrompt());
		for(int i=0; i<choices.length;i++) {
			System.out.print((i+1)+":");
			System.out.println(this.choices[i]);
		}
	}
	
}

public class MultipleChoiceQuestion extends Question {
	
	
	
	protected String[] choices;

	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		//FIXME
		super(prompt,answer,points);
		this.choices=choices;
		//Call the super class constructor, then create and set
		//instance variables for any values that aren't handled
		//by the base class
	}
	
	
	
	public void displayPrompt() {
		//FIXME
		System.out.println(this.getPrompt());
		for(int i=0; i<this.choices.length;i++) {
			System.out.print((i+1)+":");
			System.out.println(this.choices[i]);
		}
		/*
		 * Use the method from the base class to display the prompt,
		 * Then write more code to display all of the choices like so:
		 * 
		 * 1. Choice1
		 * 2. Choice2
		 * 3. Choice3
		 * ...
		 * N. ChoiceN
		 */
		//
	}
	
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		multipleChoice.displayPrompt();
		Scanner in = new Scanner (System.in);
		System.out.println("What is your answer?");
		String selected=in.next();
		
		
		if(multipleChoice.checkAnswer(selected)==1) {
			System.out.println("You are correct");
		} else {
			System.out.println("You are incorrect");
		}
		
		//System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		//System.out.println(multipleChoice.checkAnswer("1"));//wrong
		//System.out.println(multipleChoice.checkAnswer("3"));//right
	}

}
