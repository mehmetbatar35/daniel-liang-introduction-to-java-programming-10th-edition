package ikinciBolumSonuSorulari;

import java.util.Scanner;

public class Answer12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the take-off speed: ");
		double takeOffSpeed = input.nextDouble();
		
		System.out.println("enter the acceleration of a plane: ");
		double acceleration = input.nextDouble();
		
		double length = Math.pow(takeOffSpeed, 2) / (2 * acceleration);
		
		System.out.println(length);
		
		
		
		
		
		
	}

}
