package ikinciBolumSonuSorulari;

import java.util.Scanner;

public class Answer05 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of subtotal : ");
		double subtotal = input.nextDouble();
		
		System.out.println("Enter the value of gratuity rate : ");		
		double gratuityRate = input.nextDouble();
		
		double gratuity = subtotal * (gratuityRate + 100) / 100;
		
		System.out.println("gratuity = " + gratuity);
		
		
		
		
		
		
		
		
		
	}
}
