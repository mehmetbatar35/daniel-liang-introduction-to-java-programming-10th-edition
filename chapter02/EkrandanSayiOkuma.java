package chapter02;

import java.util.Scanner;

public class EkrandanSayiOkuma {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir sayi soyle la bebe: ");
		
		int sayi = klavye.nextInt();
		
		System.out.println("Girdiginiz sayi: " + sayi);
	}

}
