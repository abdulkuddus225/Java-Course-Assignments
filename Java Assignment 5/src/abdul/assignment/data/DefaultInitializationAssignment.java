package abdul.assignment.data;

public class DefaultInitializationAssignment {

	int assignmentInt;
	char assignmentChar;
	
	public void printDataMembers() {
		System.out.println("Printing data members........");
		System.out.println("Integer "+assignmentInt);
		System.out.println("Character "+assignmentChar);
	}
	
	public void printLocalVariables() {
		int localVariable1;
		char localVariable2;
		
		
		//The cause of error:
		// A local variable in Java is a variable that’s declared within the body of a method. 
		// Local variables are not given initial default values. 
		// Thus, we must assign a value before we use a local variable.
		System.out.println("Printing Variables........");
		System.out.println("Local Variable 1 "+localVariable1);
		System.out.println("Local Variable 2 "+localVariable2);
	}
	
}
