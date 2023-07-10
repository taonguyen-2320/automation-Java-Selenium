package javabasic.controlflowstatements.decisionmaking;

import java.util.Scanner;

public class Ex_1_IfElseExercises {

	public static void main(String[] args) {
		
		// Take two int values from user and print greatest among them.
		
		@SuppressWarnings("resource")
		Scanner value = new Scanner(System.in);
		
		System.out.println("Enter 1st value: ");
		int firstValue = Integer.parseInt(value.next()); 
		System.out.println("Enter 2nd value: ");
		int secondValue = Integer.parseInt(value.next()); 
		
		// simple condition < (condition) ? (if condition = true) : ( if condition = false) >
		// You can or cannot create variable to get the result and reuse it in other place, if doesn't reuse should be print without create variable
		
		String result = (firstValue > secondValue) ? ("The greatest number is " + firstValue) : ("The greatest number is " + secondValue);
        System.out.println(result);
		
		/*
		 	A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
			Ask user for quantity
			Suppose, one unit will cost 100.
			Judge and print total cost for user.
		 */
		
		System.out.println("----------- Other Ex --------------");
		System.out.println("Enter the product quality: ");
		int productQuality = Integer.parseInt(value.next());
		float productPrice = 100;
		
		if (productQuality > 1000) {
			System.out.println("Total price include discount: "+((float)(productPrice*productQuality)-((productPrice*productQuality)*0.1)));
		} else {
			System.out.println("Total price: "+(float)(productPrice*productQuality));
		}

	}

}
