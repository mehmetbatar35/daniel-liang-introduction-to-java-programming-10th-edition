package chapter02;

import java.util.Scanner;

public class FahrenayttanDereceyeCevir {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dereceye donusturulmesi icin bir fahrenayt derecesi girin: ");
		
		
		int fahrenayt = input.nextInt();
		
		double celsius = (5.0 / 9) * fahrenayt - 32; 
		
		System.out.println(fahrenayt + " fahrenayt = " + celsius + " derecedir.");
		
		
		
		
	}
}
