package javaAssignment2;

public class EnglishAlphabets {

	public String englishAlphabets() {

		String alphabets = "";
		for (int small = 65; small < 91; small++) {

			char c = (char) small;
			alphabets += c;
		}
		return alphabets;
	}
}
