package javaAssignment1;

import java.util.Scanner;

public class GetInput {

	Scanner sc = new Scanner(System.in);
	public String getDirectoryInput() {
		
		System.out.println("Enter the directory you want to search ");
		String directory = sc.nextLine();
		return directory;
	}
	
	public String getPattern() {
		
		System.out.println("Enter the pattern ");
		String pattern = sc.nextLine();
		return pattern;
	}
	
}
