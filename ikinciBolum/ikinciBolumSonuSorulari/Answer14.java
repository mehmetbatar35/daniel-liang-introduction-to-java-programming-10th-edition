package ikinciBolumSonuSorulari;

import java.util.Scanner;

public class Answer14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the value of weight in pounds: ");
		double pound = input.nextDouble();

		System.out.println("Enter the value of height in inches: ");
		double inch = input.nextDouble();

		double kilograms = pound * 0.45359237;

		double meter = inch * 0.0254;

		double bodyMassIndex = kilograms / Math.pow(meter, 2);

		System.out.println(bodyMassIndex);

	}

}
