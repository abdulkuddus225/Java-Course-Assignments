package abdul.assignment.singleton;

public class Singleton {

	public String non_static_member;
	
	
	public static Singleton static_method(String parm) {
		// The cause of Error: 
		// A static method can access static data member and can change the value of it.
		// Here static_method is accessing a non static data member that is not allowed.
		non_static_member = parm;
		
		Singleton obj = new Singleton();
		
		return obj;
	}
	
	public void non_static_method() {
		System.out.println(non_static_member);
	}
	
	
	
}
