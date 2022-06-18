package ikinciBolumSonuSorulari;

import java.util.Scanner;

public class Answer06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the integer value between 0 and 1000");
		int value = input.nextInt();
		
		int firstNum = value % 10;
		System.out.println(firstNum);
		
		value = value / 10;
		int secondNum = value % 10;
		System.out.println(secondNum);
		
		value = value / 10;
		int thirdNum = value % 10;
		System.out.println(thirdNum); 
		
		int totalAmount = firstNum + secondNum + thirdNum;
		System.out.println("Total Amount = " + totalAmount);
		
		
		
		
		
		
		
		
	}

}
