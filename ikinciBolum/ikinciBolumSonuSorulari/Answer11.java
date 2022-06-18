package ikinciBolumSonuSorulari;

import java.util.Scanner;

public class Answer11 {

	public static void main(String[] args) {

		int currentPopulation = 312_032_486;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of years to display the population growth: ");
		int numberOfYears = input.nextInt();

		double secondsInYear = 365 * 24 * 60 * 60;

		int birthPerYear = (int) secondsInYear / 7;
		int deathsPerYear = (int) secondsInYear / 13;
		int immigrantsPerYear = (int) secondsInYear / 45;
		
		for(int i = 1; i <= numberOfYears; i++) {
			
			currentPopulation += birthPerYear + immigrantsPerYear - deathsPerYear;
		}
System.out.println("the population in " + numberOfYears + " years is = " + currentPopulation);
	}

}
