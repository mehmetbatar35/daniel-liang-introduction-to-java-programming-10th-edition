package ikinciBolumSonuSorulari;

import java.util.Scanner;

public class Answer08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your timezone: ");
		long timeZoneChange = input.nextLong();

		long totalMilliSeconds = System.currentTimeMillis();// 1970ten gunumuze milisaniye toplami

		long totalSeconds = totalMilliSeconds / 1000; // mili saniye , saniyenin 1000e bolumu
		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60;
		long currentHour = (totalHours + timeZoneChange) % 24;

		System.out.println("Current time is : " + currentHour + ":" + currentMinute + ":" + currentSecond);

	}

}
