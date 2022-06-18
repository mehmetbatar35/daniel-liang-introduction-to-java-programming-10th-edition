package chapter03;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hangi yil: ");
		int yil = input.nextInt();
		
	/*	boolean artikYilMi = yil % 4 == 0;
		 
		artikYilMi = artikYilMi && yil % 100 != 0;
		
		artikYilMi = artikYilMi || yil % 400 == 0;*/
		//asagida yazdigim yukaridakilerle ayni. Ya onu ya da onu yazacaksin
		
		boolean artikYilMi = (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);
		
		
		if(artikYilMi) {
			System.out.println(yil + " artik yildir.");
		} else {
			System.out.println(yil + "artik yil degildir.");
		}
		
		
		
		
		
		
	}

}
