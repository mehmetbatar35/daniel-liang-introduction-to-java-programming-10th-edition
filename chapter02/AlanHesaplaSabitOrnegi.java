package chapter02;

import java.util.Scanner;

public class AlanHesaplaSabitOrnegi {

	public static void main(String[] args) {

		final double pi = 3.14159;

		Scanner girdi = new Scanner(System.in);

		double yaricap;
		double alan;

		System.out.println("Alani hesaplanacak cemberin yaricapini gir: ");

		yaricap = girdi.nextInt();

		alan = yaricap * yaricap * pi;

		System.out.println("yaricapi " + yaricap + " olan cemberin alani: " + alan + " dir.");

	}

}
