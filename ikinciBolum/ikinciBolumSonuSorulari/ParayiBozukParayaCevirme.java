package ikinciBolum;

import java.util.Scanner;

public class ParayiBozukParayaCevirme {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("How much money do you have? : ");
		double amount = input.nextDouble();
		int remainingAmount = (int) (amount * 100);

		System.out.println("Your money is " + remainingAmount + " cent.");

		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

		int numberOfFifty = remainingAmount / 50;
		remainingAmount = remainingAmount % 50;

		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		int numberOfPennies = remainingAmount;

		System.out.println("Your amount " + amount + " consist of ");
		System.out.println("     " + numberOfOneDollars + " dollars");
		System.out.println("     " + numberOfQuarters + " quarters ");
		System.out.println("     " + numberOfDimes + " dimes ");
		System.out.println("     " + numberOfNickels + " nickels ");
		System.out.println("     " + numberOfPennies + " pennies");

	}
}
