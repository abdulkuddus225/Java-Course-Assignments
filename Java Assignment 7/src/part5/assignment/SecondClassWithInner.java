package part5.assignment;

import part5.assignment.FirstClassWithInnerClass.InnerClass;

public class SecondClassWithInner {

	
	public class SecondInner extends InnerClass{

		public SecondInner(FirstClassWithInnerClass firstClassWithInnerClass, String arg) {
			firstClassWithInnerClass.super(arg);
			// TODO Auto-generated constructor stub
			System.out.println("Inherited Inner Class");
		}
		
		
		
	}
	
	public void accessingInner() {
		FirstClassWithInnerClass f = new FirstClassWithInnerClass();
		
		SecondInner in = new SecondInner(f, "This is from Second Inner Class");
	}
}
