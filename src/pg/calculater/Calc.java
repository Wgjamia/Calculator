package pg.calculater;

import java.util.Scanner;

public class Calc {

	static boolean contains(char c, char[] array) {
		for (char x : array) {
			if (x == c) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		char operator;
		Double n1, n2, result;
		char[] storOper = { '+', '-', '*', '/' };

		while (true) {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("Choose an Operator: +, -, *, / or Press any key to exit....");
			operator = input.next().charAt(0);

			if (contains(operator, storOper) == true) {
				System.out.println("Enter The First Number");
				n1 = input.nextDouble();

				System.out.println("Enter second number");
				n2 = input.nextDouble();

				switch (operator) {
				case '+':
					result = n1 + n2;
					System.out.println(n1 + " + " + n2 + " = " + result);
					break;
				case '-':
					result = n1 - n2;
					System.out.println(n1 + " - " + n2 + " = " + result);
					break;
				case '*':
					result = n1 * n2;
					System.out.println(n1 + " * " + n2 + " = " + result);
					break;
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
				System.out.println("The system has been terminated");
				System.exit(0);
				break;
			}
		}
	}

}
