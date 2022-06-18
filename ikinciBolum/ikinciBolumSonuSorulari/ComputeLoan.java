package ikinciBolum;

import java.util.Scanner;

public class ComputeLoan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		
		System.out.println("Kac yilda odemek istiyorsun: ");
		int year = input.nextInt();
		
		System.out.println("Borc alinan miktar: ");
		double loan = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		
		double monthlyPayment = (loan * monthlyInterestRate) / (1 - (1 / Math.pow(1 + monthlyInterestRate, year * 12)));
		
		double totalLoan = monthlyPayment * 12 * year;
		
		System.out.println("Monthly Payment: " + (int) (monthlyPayment * 100) / 100.0);
		System.out.println("Total Payment: " + (int) (totalLoan * 100) / 100.0);
		
		
		
		
		
		
		
		
	}

}
