package ikinciBolumSonuSorulari;

import java.util.Scanner;

public class Answer07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the minutes to turn into years and days : ");
		
		int minutes = input.nextInt();
		
		int years = minutes / (60 * 24 * 365);
		
		int days = (minutes / 60 / 24) % 365;
		
	System.out.println(minutes + " minutes = " + years + " years, " + days + " days.");
		
		
		
		
		
		
		
	}
}
