package chapter03;

import java.util.Scanner;

public class DersNotuBulanProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ders puaninizi giriniz: (0 ile 100 arasinda)");
		
		int derspuani = input.nextInt();
		
		if(derspuani >= 90 ) {
			System.out.println("Ders notunuz A");
		}else if(derspuani >= 80 ) {
			System.out.println("Ders notunuz B");
		}else if(derspuani >= 70 ) {
			System.out.println("Ders notunuz C ");
		}else if(derspuani >= 60 ) {
			System.out.println("Ders notunuz D");
		}else {
			System.out.println("Ders notunuz F, dersten kaldin gardas.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
