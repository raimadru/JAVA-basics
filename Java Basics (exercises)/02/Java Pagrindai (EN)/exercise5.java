package mokymasis;

import java.util.Scanner;

public class exercise5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int days = 0, hours = 0, minutes = 0, seconds = 0;
		
		System.out.println("Enter the number of days: ");
		days = input.nextInt();
		
		System.out.println("Enter the number of hours: ");
		hours = input.nextInt();
		
		System.out.println("Enter the number of minutes: ");
		minutes = input.nextInt();
		
		System.out.println("Enter the number of seconds: ");
		seconds = input.nextInt();
		
		seconds = input.nextInt();
		days += (hours*365);
		hours += (minutes*24);
		minutes += (seconds*60);
		
		System.out.println("Enter the number of seconds " + seconds);
	}

}
