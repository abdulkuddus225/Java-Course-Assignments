package exceptions.assignment;

import java.io.FileNotFoundException;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception e = new Exception();
		try {
			e.throwException();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ArithmeticException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NullPointerException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			System.out.print("Executed");
		}
	}

}
