package javabasic.controlflowstatements.decisionmaking;

import java.util.Scanner;

public class IfElseDemo {

	// IF statement in Java tells the program to execute a certain section of code
	// only if the specified condition is evaluated to TRUE.
	// IF ELSE statement provides an additional path of execution in case the "IF"
	// clause is evaluated to FALSE

	// Ctrl+Shift+F to reformat your codes

	// Always add blank line before and after a code block

	public static void main(String[] args) {

		String inputString;

		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter string:");
			inputString = s.next();
		}

		System.out.println("SimpleIf");

		if (inputString.length() > 1)
			System.out.println(inputString);

		System.out.println("IfElse");

		if (inputString.length() > 1) {
			System.out.println(inputString);
		} else {
			System.out.println("The provided text must has more than 1 character");
		}

		System.out.println("If and Else If");

		if (inputString.length() > 1 && inputString.length() < 3) {
			System.out.println(inputString);
		} else if (inputString.length() >= 3) {
			System.out.println(inputString.substring(1, 3));
		} else {
			System.out.println("The provided text must has more than 1 character");
		}

		System.out.println("Nested IfElse");

		if (inputString.length() > 1 && inputString.length() <= 3) {
			System.out.println(inputString);
		} else if (inputString.length() >= 3) {
			String editedText;

			if (inputString.length() == 3) {
				editedText = inputString.substring(1);
			} else {
				editedText = inputString.substring(1, 3);
			}

			System.out.println(editedText);
		} else {
			System.out.println("The provided text must has more than 1 character");
		}

		System.out.println("Ternary Operation");

		int length = inputString.length();

		if (length > 1 && length <= 3) {
			System.out.println(inputString);
		} else if (length >= 3) {

			// Should only use ternary operation when the condition is simple and straight forward to avoid complexity while debugging
			String editedText = length == 3 ? inputString.substring(1) : inputString.substring(1, 3);

			System.out.println(editedText);
		} else {
			System.out.println("The provided text must has more than 1 character");
		}
	}
}