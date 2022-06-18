package chapter03;

import java.util.Scanner;

public class ToplamaAraSinavi {

	public static void main(String[] args) {

 		int sayi1 = (int) (10 * Math.random());
		int sayi2 = (int) (10 * Math.random());
		
		
		System.out.println(sayi1 + " + " + sayi2 + " = ?");
		
		Scanner input = new Scanner(System.in);
		
		int toplam = input.nextInt();
		
		if(sayi1 + sayi2 == toplam) {
			System.out.println("Dogru");
		}else {
			System.out.println("yanlis");
		}
		
		
		
		
		
		
		
	}

}
