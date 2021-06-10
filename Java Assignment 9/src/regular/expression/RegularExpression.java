package regular.expression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpression {

	public void getMatch() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentance: ");
		String text = sc.nextLine();
		sc.close();
		boolean match = Pattern.matches("^\\p{javaUpperCase}.*[.]$", text);

		if (match) {
			System.out.println("The sentence beigns with a capital letter and ends with a period. ");
		}

		else {
			System.out.println("The sentence does not beigns with a capital letter and ends with a period. ");
		}
	}
}
