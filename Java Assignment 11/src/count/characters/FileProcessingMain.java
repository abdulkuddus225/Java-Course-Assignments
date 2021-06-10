package count.characters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FileProcessingMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Input File name: " + args.length);

		if (args.length > 0) {

			HashMap<Character, Integer> characterCount;
			characterCount = new HashMap<Character, Integer>();
			StringBuilder resultStringBuilder = new StringBuilder();

			FileReader f = new FileReader(args[0]);
			BufferedReader br = new BufferedReader(f);
			String line;
			while ((line = br.readLine()) != null) {
				resultStringBuilder.append(line);
			}

			String content = resultStringBuilder.toString();
			content = content.toLowerCase();
			content = content.replaceAll("\\s", "");
			char[] strArray = content.toCharArray();
			characterCount.clear();
			for (char c : strArray) {

				if (!characterCount.containsKey(c)) {
					characterCount.put(c, 1);
				}
				characterCount.put(c, characterCount.get(c) + 1);
			}
			for (HashMap.Entry entry : characterCount.entrySet()) {
				System.out.println("Character " + entry.getKey() + " has count " + entry.getValue());
			}
		} else {
			System.out.println("Please enter a file name (Syntax: java FileProcessingMian.java <filepath>) ");
		}
	}
}
