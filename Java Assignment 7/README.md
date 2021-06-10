# This assignment has five parts.

## First: 
	This program describes how inheritance works and how we can create array of objects and iterate over them.
	Rodent.java: This is a abstract class which contains the method that belong to rodent.
	HouseMouse.java: This inherits from Rodent class and implements its own functionalities by method overriding.
	AlaskaMarmot.java: This inherits from Rodent class and implements its own functionalities by method overriding.
	RodentMain.java: Create array of objects of Rodet and the iterate over the objects while displaying results.

## Second:
	Cycle.java: Class that contains a funtion name cycle.
	Tricycle.java: Class that inherit from Cycle class and does not contains balance().
	Unicycle.java: Class that Class that inherit from Cycle class and does not contains balance().
	Bicycle.java: Class Class that Class that inherit from Cycle class and does not contains balance().

	CycleMain.java: Contains the main class which will create objects for all the classes and check weather we can access the balance method for each class,
			This will produce an error.

## Third:
	MainClass.java: This is a main class which will create object of class ImplementingInterfaces.java which implements a Interface i.e InterfaceABC
		  	The InterfaceABC implements three interfaces InterfaceA, InterfaceB, and InterfaceC.
			This Interface contains a method interfaceABC_Method()
			Each Interface InterfaceA, InterfaceB, InterfaceC has two functions and these will be implemented in ImplementingInterfaces.java as Method Overriding.
			In the Main class we have 4 private static Method each takes and Interface as an argument.

## Fourth: 
	This program describes how we can create diffent factories for creating objects of differnet types 
	MainClass.java class create three objects of type interface Cycle which includes a method named ride()
	Now each object will have a factory like BiFactory which implements the interface CycleFactory.
	CycleFactory -> BiFactory -> Bicylce

## Fifth:
	This program will create a class with an inner class that has a non-default constructor (one that takes arguments). 
	Create a second class with an inner class that inherits from the first inner class.
	
	
