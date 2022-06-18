package ikinciBolumSonuSorulari;

import java.util.Scanner;

public class Answer02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the radius: ");
		double radius = input.nextDouble();
		
		System.out.println("What is the length: ");
		double length = input.nextDouble();
		
		double area = radius * radius * Math.PI;
		double volume = area * length;
		
		System.out.println("the area is: " + area);
		System.out.println("the volume is " + volume);
		
		
		
		
		
		
		
	}
}
