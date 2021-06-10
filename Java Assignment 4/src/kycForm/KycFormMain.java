package kycForm;

import java.util.ArrayList;
import java.util.Scanner;

public class KycFormMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dates;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of cases: ");
		int n = sc.nextInt();
		System.out.println("Enter Signup date and current date (dd-mm-yyyy): ");
		sc.close();
		ArrayList<String> sign_up_dates = new ArrayList<String>();

		int count = 0;
		while (true) {
			if (count == n) {
				break;
			}
			Scanner getDates = new Scanner(System.in);
			dates = getDates.nextLine();
			getDates.close();
			sign_up_dates.add(dates);
			count++;

		}

		for (String s : sign_up_dates) {

			String signup_date = s.substring(0, 10);
			String current_date = s.substring(11, 21);
			KycForm test = new KycForm(signup_date, current_date);
			test.getRange();
		}

	}

}
