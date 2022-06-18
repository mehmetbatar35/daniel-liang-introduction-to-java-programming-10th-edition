package chapter03;

import java.util.Scanner;

public class Piyango {

	public static void main(String[] args) {

		int piyango = (int) (Math.random() * 90) + 10; // cunku sayim 10 ve 100 arasinda olacak.10<= x <=99. iki
														// haneli bir sayi olacak
		Scanner input = new Scanner(System.in);

		System.out.println("Piyango tahmininizi giriniz: (iki haneli olmak zorunda)");
		int tahmin = input.nextInt();

		int piyangoBirlerBasamagi = piyango % 10;
		int piyangoOnlarBasamagi = piyango / 10;

		int tahminBirlerBasamagi = tahmin % 10;
		int tahminOnlarBasamagi = tahmin / 10;

		System.out.println("Piyango numarasi: " + piyango);
		if (piyango == tahmin) {
			System.out.println("Tebrikler bildin. 10000 tl kazandin.");
		} else if (piyangoBirlerBasamagi == tahminOnlarBasamagi && piyangoOnlarBasamagi == tahminBirlerBasamagi) {
			System.out.println("Iki rakami da tutturdunuz. 3000 tl kazandiniz");
		} else if (piyangoBirlerBasamagi == tahminBirlerBasamagi || piyangoBirlerBasamagi == tahminOnlarBasamagi
				|| piyangoOnlarBasamagi == tahminOnlarBasamagi || piyangoOnlarBasamagi == tahminBirlerBasamagi) {
			System.out.println("1 rakami bildiniz. 1000 tl kazandin.");
		} else {
			System.out.println("Bilemediniz");
		}
	}
}
