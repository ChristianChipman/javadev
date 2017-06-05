/*
Create a Scanner
Prompt for investment amount
Read investment amount
Prompt for annual interest rate
Calculate the monthly interest rate
Prompt for years
Read years
Calculate future value
Display future value
*/

import java.util.Scanner;

public class A2dot21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the investment amount: $");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Please enter in the annual interest rate: %");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200.0;
		
		System.out.print("Please enter the number of years: ");
		double numberOfYears = input.nextDouble();
	
		double futureValue = investmentAmount * Math.pow(1.0 + monthlyInterestRate, numberOfYears * 12.0);
		System.out.println("The accumulated value is $" + ((int)(futureValue * 100.0)) / 100.0);
	}
}