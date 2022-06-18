package chapter02;

import java.util.Scanner;

public class KullaniciGirdisiyleAlanHesapla {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		double yaricap;
		double alan;
		
		System.out.println("Alani hesaplanacak cemberin yaricapini gir: ");
		
		yaricap = girdi.nextInt();
		
		alan = yaricap * yaricap * 3.14159;
		
		System.out.println("yaricapi " + yaricap + " olan cemberin alani: " + alan + " dir.");
		
		
		
	}
}
