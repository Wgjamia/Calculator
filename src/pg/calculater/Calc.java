package pg.calculater;

import java.util.Scanner;

public class Calc {
	// Create default method for searching in Array return (True or False) 
	static boolean contains(char c, char[] array) {
		for (char x : array) {
			if (x == c) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// Create Variable for Calculator
		char operator;
		Double n1, n2, result;
		char[] storOper = { '+', '-', '*', '/' };
		// Access to the calculator system
		while (true) {
			// create an object of Scanner on class
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			// ask users to enter the operator
			System.out.println("Choose an Operator: +, -, *, / or Press any key to exit....");
			operator = input.next().charAt(0);

			if (contains(operator, storOper) == true) {
				// ask users to enter the numbers
				System.out.println("Enter The First Number");
				n1 = input.nextDouble();

				System.out.println("Enter second number");
				n2 = input.nextDouble();

				switch (operator) {
				// Calculator addition process
				case '+':
					result = n1 + n2;
					System.out.println(n1 + " + " + n2 + " = " + result);
					break;
				// Calculator subtraction process
				case '-':
					result = n1 - n2;
					System.out.println(n1 + " - " + n2 + " = " + result);
					break;
				// Multiplication in calculator
				case '*':
					result = n1 * n2;
					System.out.println(n1 + " * " + n2 + " = " + result);
					break;
				// division process in calculator
				case '/':
					if (n2 == 0) {
						System.out.println("Cannot divide by zero");
					} else {
						result = n1 / n2;
						System.out.println(n1 + " / " + n2 + " = " + result);
					}
					break;

				default:
					System.out.println("Invalid operator!");
					break;
				}
			} else {
				// Terminated for Calculater
				System.out.println("The system has been terminated");
				System.exit(0);
				break;
			}
		}
	}

}
