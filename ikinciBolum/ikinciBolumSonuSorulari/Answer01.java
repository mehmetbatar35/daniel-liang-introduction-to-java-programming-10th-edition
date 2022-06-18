package ikinciBolumSonuSorulari;

import java.util.Scanner;

public class Answer01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give me a Celsius Degree: ");
		
		
		double celsius = input.nextDouble();
		 
		double fahrenheit = (9.0 / 5) * celsius + 32;
		
		System.out.println(celsius + " celsius is = " + fahrenheit +" fahrenheit.");
		
		
		
		
		
		
		
		
	}
}
