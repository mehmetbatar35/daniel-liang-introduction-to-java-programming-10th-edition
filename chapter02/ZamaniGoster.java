package chapter02;

import java.util.Scanner;

public class ZamaniGoster {
	public static void main(String[] args) {
		System.out.println("saniye cinsinden bir tamsayi giriniz: ");

		Scanner input = new Scanner(System.in);

		int second = input.nextInt();

		int minutes = second / 60;

		int leftSecond = second % 60;

		System.out.println(second + " saniye: " + minutes + " dakika " + leftSecond + " saniyedir.");

	}

}
