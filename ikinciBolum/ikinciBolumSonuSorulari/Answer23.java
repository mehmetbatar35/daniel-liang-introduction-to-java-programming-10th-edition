package ikinciBolumSonuSorulari;

import java.util.Scanner;

public class Answer23 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the distance: ");
		double distance = input.nextDouble();
		
		System.out.println("Enter the miles per galon: ");
		double miles = input.nextDouble();
		
		System.out.println("Enter the price per galon: ");
		double price = input.nextDouble();
		
		double costOfTrip = distance * price / miles;
		
		System.out.println(costOfTrip);
		
		
		
		
		
		
		
		
		
		
	}
}
