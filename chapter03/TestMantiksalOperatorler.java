package chapter03;

import java.util.Scanner;

public class TestMantiksalOperatorler {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz: ");
		
		int sayi = input.nextInt();
		
		if (sayi % 2 == 0 && sayi % 3 == 0) {
			System.out.println("girdigin sayi 2 ve 3'e tam bolunuyor.");
		}
		
		if (sayi % 2 == 0 || sayi % 3 == 0) {
			System.out.println("girdigin sayi 2 veya 3'e bolunuyor.");
		}
		
		if (sayi % 2 == 0 ^ sayi % 3 == 0) {
			System.out.println("girdigin sayi 2 veya 3'e  bolunuyor ancak her ikisine birden bolunmuyor.");
		}
		
	}

}
