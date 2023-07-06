package javabasic.controlflowstatements.decisionmaking;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		/*
		 * Syntax switch(expression) { 
		 * 	case 1: 
		 * 		statements; 
		 * 		break; 
		 * 	case 2: 
		 * 		statements;
		 * 		break; 
		 * default: 
		 * 		statements; 
		 * 		break; 
		 * }
		 */
		String monthType;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter string:");
			monthType = s.next();
		}

		int basedSalary = 1000;
		double overtimeRate = 1.5;
		int bonusRate = 2;
		double finalSalary;

		switch (monthType) {
		case "yearEnd":
			finalSalary = basedSalary * bonusRate;
			break;
		case "overtime":
			finalSalary = basedSalary * overtimeRate;
			break;
		default:
			finalSalary = 8 % 3;
			break;
		}

		System.out.println(finalSalary);
	}
}
