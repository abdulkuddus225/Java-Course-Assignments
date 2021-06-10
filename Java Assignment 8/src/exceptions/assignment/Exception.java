package exceptions.assignment;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception {

	public void throwException() throws FileNotFoundException, ArithmeticException, NullPointerException {
		FileReader f = new FileReader("");
		int result = 30 / 0;
		String x = null;
		x.charAt(1);
		System.out.println(result);
		System.out.println(x);
	}
}
