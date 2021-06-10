package overloaded.constructors;

public class Overloaded {

	private static String x = "Calling From Constructor 1";

	public Overloaded() {
		this(x);
		System.out.println("The Default constructor");
	}

	public Overloaded(String x) {
		System.out.println(x);
	}

}
