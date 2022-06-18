package chapter03;

import java.util.Scanner;

public class VucutKutleEndeksi {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Agirlignizi kg cinsinden giriniz: ");
		double agirlik = input.nextDouble();
		
		System.out.println("Boyunuzu metre cinsinden giriniz: ");
		double boy = input.nextDouble();
		
		double vki = agirlik / (boy * boy);
		
		System.out.println("vki: " + vki);
		
		if(vki < 18.5) {
			System.out.println("cok zayif");
		} else if(vki < 25){
			System.out.println("Normal");
		} else if(vki < 30){
			System.out.println("Kilolu");
		} else {
			System.out.println("Obez");
		}
	
	
	
	
	}
}
