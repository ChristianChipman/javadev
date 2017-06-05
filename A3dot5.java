/*
- Make Scanner
- Prompt for the day
- Read the day
- Prompt for elapsed days
- Read elapsed days and calculate future day
- Display future day
*/

import java.util.Scanner;

public class A3dot5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter today's day: ");
		int today = input.nextInt();

		System.out.print("Enter the number of days elapsed since today: ");
		int daysElapsed = input.nextInt();
		
		int future = (today + daysElapsed) % 7;

		switch (today) {
			case 0:
				System.out.print("Today is Sunday and");
				break;
			case 1:
				System.out.print("Today is Monday and");
				break;
			case 2:
				System.out.print("Today is Tuesday and");
				break;
			case 3:
				System.out.print("Today is Wednesday and");
				break;
			case 4:
				System.out.print("Today is Thursday and");
				break;
			case 5:
				System.out.print("Today is Friday and");
				break;
			case 6:
				System.out.print("Today is Saturday and");
				break;
		}

		switch (future) {
			case 0:
				System.out.print(" the future day is Sunday.");
				break;
			case 1:
				System.out.print(" the future day is Monday.");
				break;
			case 2:
				System.out.print(" the future day is Tuesday.");
				break;
			case 3:
				System.out.print(" the future day is Wednesday.");
				break;
			case 4:
				System.out.print(" the future day is Thursday.");
				break;
			case 5:
				System.out.print(" the future day is Friday.");
				break;
			case 6:
				System.out.print(" the future day is Saturday.");
				break;
		}
	}
}