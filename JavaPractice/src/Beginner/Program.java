package Beginner;

import java.util.Scanner;

public class Program
{
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		int firstNumber = GetIntegerFromUser("Enter first number: ");
		int secondNumber = GetIntegerFromUser("Enter second number: ");

		if (firstNumber > secondNumber)
			System.out.println("First number must not be greater than the second number.");
		else
			PrintCounting(firstNumber, secondNumber);
		
	}
	
	
	static int GetIntegerFromUser(String message)
	{
		System.out.println(message);
		
		while(scanner.hasNextInt() == false)
			System.out.printf("%s is not valid integer. Please re-enter:", scanner.next());
					
		return scanner.nextInt();
	}
	
	static void PrintCounting(int from, int to)
	{
		for (int i = from; i <= to; i++)
			System.out.println(i);
		
	}

}
