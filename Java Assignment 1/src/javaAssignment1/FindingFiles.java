package javaAssignment1;

import java.util.Scanner;

public class FindingFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Y for matching files and N if you want to exit ");
		char choice = sc.next().charAt(0);
		while (choice == 'Y' || choice == 'y') {
			
			GetInput in = new GetInput();
			String directory = in.getDirectoryInput();
			String pattern = in.getPattern();
			FilePatternMatching test1 = new FilePatternMatching(pattern,  directory);
			test1.getFilesWithPattern();
			System.out.println("Please enter Y for matching files and N if you want to exit ");
			choice = sc.next().charAt(0);
			
		}
		System.out.println("You're out!!");
		
		
	}

}
