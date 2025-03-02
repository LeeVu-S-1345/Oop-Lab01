package lab01;

import java.util.Scanner;

public class DisplayNumberOfDays {
	public DisplayNumberOfDays() {}
	
	public boolean checkLeapYear(int year) {
		if(year % 400 == 0) return true;
		else if(year % 100 == 0 && year % 400 != 0) return false;
		else if(year % 4 == 0) return true;
		return false;
	}
	
	public int isValidMonth(String month) {
		if(month.equals("January") || month.equals("Jan.") ||
				month.equals("Jan") || month.equals("1")) return 1;
		if(month.equals("February") || month.equals("Feb.") ||
				month.equals("Feb") ||month.equals("2")) return 2;
		if(month.equals("March") || month.equals("Mar.") ||
				month.equals("Mar") || month.equals("3")) return 3;
		if(month.equals("April") || month.equals("Apr.") ||
				month.equals("Apr") || month.equals("4")) return 4;
		if(month.equals("May") || month.equals("5")) return 5;
		if(month.equals("June") || month.equals("Jun") || month.equals("6")) return 6;
		if(month.equals("July") || month.equals("Jul") || month.equals("7")) return 7;
		if(month.equals("August") || month.equals(" Aug.") ||
				month.equals("Aug") || month.equals("8")) return 8;
		if(month.equals("September") || month.equals("Sept.") ||
				month.equals("Sep") || month.equals("9")) return 9;
		if(month.equals("October") || month.equals("Oct.") ||
				month.equals("Oct") || month.equals("10")) return 10;
		if(month.equals("November") || month.equals("Nov.") ||
				month.equals("Nov") ||month.equals("11")) return 11;
		if(month.equals("December") || month.equals("Dec.") ||
				month.equals("Dec") || month.equals("12")) return 12;
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		DisplayNumberOfDays obj = new DisplayNumberOfDays();
		String month;
		int m;
		int year;
		do {
			System.out.print("Enter a month: ");
			month = read.nextLine();
			m = obj.isValidMonth(month);
			if(m == -1) {
				System.out.println("Wrong Syntax! Please enter again!");
				continue;
			}
			System.out.print("Enter a year: ");
			year = read.nextInt();
			if(year < 0) {
				System.out.println("Enter again!");
				continue;
			}
			break;
		}while(true);
		
		if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			System.out.println("The number of days of this month are 31");
		}
		else if(m == 4 || m == 6 || m == 9 || m == 11) {
			System.out.println("The number of days of this month are 30");
		}
		else if(m == 2 && obj.checkLeapYear(year)) {
			System.out.println("The number of days of this month are 29");
		}
		else if(m == 2 && !obj.checkLeapYear(year)) {
			System.out.println("The number of days of this month are 28");
		}
		read.close();
	}
}
