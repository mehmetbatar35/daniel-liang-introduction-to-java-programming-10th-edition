package ikinciBolumSonuSorulari;

import java.util.Scanner;

public class Answer20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Balance: ");
		double balance = input.nextDouble();
		
		System.out.println("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		
		double interest = balance * (annualInterestRate / 1200);
		System.out.println(interest);
		
		
		
		
		
		
		
	}

}
