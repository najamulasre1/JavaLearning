package Hello;

import java.util.Scanner;

public class Counting
{
/*
 * 1. Change so input is taken on the same line
 * 2. Ask user for another input : Enter step: - the counting should step by this number.
 *    Challenge: what if user enters 0 or a negative number?
 * 2. After input, it should print: Printing counting from <> to <> with step <>
 * 
 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter first number:");
		int firstNumber = s.nextInt();

		System.out.println("Enter second number:");
		int secondNumber = s.nextInt();

		if (firstNumber > secondNumber)
		{
			System.out.println("First number must not be greater than the second number.");
		}
		else
		{
			for (int i = firstNumber; i <= secondNumber; i++)
			{
				System.out.println(i);
			}
		}

		s.close();
	}

}
