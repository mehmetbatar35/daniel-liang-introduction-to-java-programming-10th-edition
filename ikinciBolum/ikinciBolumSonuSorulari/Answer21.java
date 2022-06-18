package ikinciBolumSonuSorulari;

import java.util.Scanner;

public class Answer21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter the investment amount : ");
		double investmentAmount = input.nextDouble();

		System.out.println("enter the annual interest rate : ");
		double monthlyInterstRate = input.nextDouble() / 1200;

		System.out.println("How many years do you want : ");
		int numbOfYears = input.nextInt();

		double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterstRate, numbOfYears * 12);

		System.out.println(futureInvestmentValue);

	}
}
