package javaAssignment1;

import java.util.Scanner;

public class FindingFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char choice = 'y';

		do {

			GetInput in = new GetInput();
			String directory = in.getDirectoryInput();
			String pattern = in.getPattern();
			FilePatternMatching test1 = new FilePatternMatching(pattern, directory);
			test1.getFilesWithPattern();
			System.out.println("Do you want to continue? (Y)");
			choice = sc.next().charAt(0);

		} while (choice == 'Y' || choice == 'y');
		sc.close();
		System.out.println("You're out!!");

	}
}
