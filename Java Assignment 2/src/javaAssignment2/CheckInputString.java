package javaAssignment2;

public class CheckInputString {

	private String input;

	public CheckInputString(String input) {
		this.input = input;

	}

	public boolean checkString() {

		EnglishAlphabets alpha = new EnglishAlphabets();

		String alphabets = alpha.englishAlphabets();

		input = input.toUpperCase();

		boolean containsAllAlpha = false;

		for (int i = 0; i < input.length(); i++) {

			if (input.contains(alphabets)) {

				containsAllAlpha = true;
			}

		}

		return containsAllAlpha;
	}

}
