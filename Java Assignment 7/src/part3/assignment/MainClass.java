package part3.assignment;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ImplementingInterfaces obj = new ImplementingInterfaces();
		InterfaceA inA = obj;
		InterfaceB inB = obj;
		InterfaceC inC = obj;
		InterfaceABC inABC = obj;
		Method1(inA);
		Method2(inB);
		Method3(inC);
		Method4(inABC);
		
	}

	private static void Method4(InterfaceABC inABC) {
		// TODO Auto-generated method stub
		System.out.println("Calling from a Class by passing Interface ABC as argument");
		
	}

	private static void Method3(InterfaceC inC) {
		// TODO Auto-generated method stub
		System.out.println("Calling from a Class by passing Interface C as argument");
		
	}

	private static void Method2(InterfaceB inB) {
		// TODO Auto-generated method stub
		System.out.println("Calling from a Class by passing Interface B as argument");
		
	}

	private static void Method1(InterfaceA inA) {
		// TODO Auto-generated method stub
		System.out.println("Calling from a Class by passing Interface B as argument");
		
	}

}
