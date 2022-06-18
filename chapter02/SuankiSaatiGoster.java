package chapter02;

public class SuankiSaatiGoster {
	public static void main(String[] args) {

		long toplamMiliSaniye = System.currentTimeMillis();// 1970ten bu yana olan milisaniye.. Butun pcler buradan baslar

		System.out.println("toplamMiliSaniye = " + toplamMiliSaniye);

		long toplamSaniye = toplamMiliSaniye / 1000;// toplam saniye= 1970ten, bugune kadar gecen toplam saniyedir.

		System.out.println("toplamSaniye = " + toplamSaniye);

		long suankiSaniye = toplamSaniye % 60;// o gunden bugune gecen tum saniyelerin mod60i bugunku saniyeyi verir

		System.out.println("suankiSaniye = " + suankiSaniye);

		long toplamDakika = toplamSaniye / 60;

		System.out.println("toplamDakika = " + toplamDakika);

		long suankiDakika = toplamDakika % 60;

		System.out.println("simdikiDakika = " + suankiDakika);

		long toplamSaat = toplamDakika / 60;
		
		System.out.println("toplamSaat = " + toplamSaat);

		long suankiSaat = toplamSaat % 24;// gun 24 saat old icin

		// bu greenwiche gore aldigi icin yanlis, belcika 2 saat ileride

		System.out.println("simdikiSaat = " + suankiSaat);
		
		System.out.println(suankiSaat + ":" + suankiDakika + ":" + suankiSaniye + " GMT");

	}
}
