# This program is divided into three packages.

## First:
	DefaultInitializationAssignment.java: 
			1. This file contains two data members name assignmentInt and assignmentChar and a funtion named printDataMembers() which will print these two data members.
			2. The second method contains two local variables one of type int and another of char and print the variables.

Note: This file describes that how we can print the data members without initializing them but we need an initialization for local variables.


## Secodn:
	non_static_member.java:
		1. This file contains a static method named static_method() with a parameter parm of string type which tries to initialize the non_static_member created outsire this method. 
		   This will produce an erroe as static methods can access static data members only.
		2. The second method non_static_method() will print the non_static_method. 


## Third: 
	AssignmentMain:
		1. This file is main file that create the object of DefaultInitializationAssignment class and tried to access the data members and the method.
		2. Tries to access the static_method of Singleton class.


 
