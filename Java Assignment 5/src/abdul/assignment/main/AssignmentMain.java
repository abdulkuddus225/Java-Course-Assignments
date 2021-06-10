package abdul.assignment.main;

import abdul.assignment.data.DefaultInitializationAssignment;
import abdul.assignment.singleton.Singleton;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultInitializationAssignment obj_of_first_class = new DefaultInitializationAssignment();
		
		obj_of_first_class.printDataMembers();
		obj_of_first_class.printLocalVariables();
		
		Singleton.static_method("calling_static_method");
		
		
		
		
	}

}
