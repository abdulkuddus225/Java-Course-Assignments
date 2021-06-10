# This program have four  parts 

## First:
	Vampire Numbers: In number theory, a vampire number (or true vampire number) is a composite natural number with an even number of digits, that can be factored into two natural numbers each with half as many digits as the original number and not both with trailing zeroes, where the two factors contain precisely all the digits of the original number, in any order, counting multiplicity. The first vampire number is 1260 = 21 × 60.

	The program is to find first 100 vampire numbers.
	VampireNumbers.java:  This is the class which implements the vampire numbers in java it contains:
				1. Data Members: int number - The number to be checked.
						 int digitCount  - Count the number of digit in the number if count is even then the number cannot be a vampire number,
							      if count is two then also it cannot be a vampire number
						 int factor - Holds the result of two factor form to chek if the number is equals to this factor or not
						 int second_factor - Holds the result of second factor of a number.
						 int v - if v is greater then 0 it means a number is a vampire number.

				2. VampireNumbers(): Constructor of the class that takes a number as input.
				3. vampireNumbers(): Checks if number is vampire number or not, return boolean.

## Second:
	This program describes how to create overloaded constructor and call one constructor into another.

	Overloaded.java: This contains two constructors a. Overloaded() - This will call another constructor Overloaded(String x) and display the result.


## Third and Fourth:

	This program will create a class (ConstructorClass.java) with constructor which will take a String as arg and during construction it will print the argument.
	ConstructorMain.java: This will now create the array of object refrences to the class and then in fourth part it will assign the objects and display the result.

 

