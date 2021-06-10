package javaAssignment2;

import java.util.Scanner;

public class CheckAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a string: ");
		String inputString = sc.nextLine();

		sc.close();

		CheckInputString test = new CheckInputString(inputString);
		boolean result = test.checkString();
		if (result) {
			System.out.println("The input string contains all the english alphabets");
		} else {
			System.out.println("Sorry! The input string does not contain all the english alphabet");
		}

	}

}
