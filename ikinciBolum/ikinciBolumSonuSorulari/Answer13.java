package ikinciBolumSonuSorulari;

import java.util.Scanner;

public class Answer13 {
	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of a monthly saving amount: ");

		double 	amount = input.nextDouble();
		
		double monthlyInterestRate = 0.05 / 12;
		
		int count = 6;
		double total = 0;
		
		for(int i = 1; i <= count; i++) {
			
		total = (total + amount) * (monthlyInterestRate + 1);	
		System.out.println("Year " + i + " in my account = " + total );
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
