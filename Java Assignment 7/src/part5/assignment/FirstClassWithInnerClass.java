package part5.assignment;

public class FirstClassWithInnerClass {

	
	public class InnerClass {
		
		String arg;
		
		public InnerClass(String arg) {
			this.arg = arg;
			System.out.println("This is the first class with inner class with non-default constructor");
		}
		
	}
	public void accessingInnerClass() {
		InnerClass in = new InnerClass("This is a call for first Inner Class");
	}
}
