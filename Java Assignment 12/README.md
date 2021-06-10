# This program creates a Student information storing system where we can add new student and performes various queries on it.


## Student.java: This class provides the structure of the student.
		1. Contains a constructr which takes student information like id, name etc as input and set the data members.
		2. Contains various functions for getting access to individual variables like id, name etc.

## StudentMain.java: This class implements the following tasks
			1. Create a HashMap of Integer, Student type.
			2. Initialize the HashMap by calling init().
			3. The init() will add the student details to HashMap where key is id of student and value is object of the Student class.

## Queries.java: This class implements the following methods.
		1. Queries(): Constructor which takes HashMap as args.
		2. displayDepartments(): Convert the HashMap values into streams and filter out unique departments.
		3. getStudentNames(): Convert the HashMap values into streams and filter out names of students who have enrolled after 2018.
		4. getStudentNames(): Convert the HashMap values into streams and filter out all Male student of computer science department.
		5. getCountMaleFemale(): Convert the HashMap values into streams and filter out all Male and Female student and displays the count.
		6. getAvgAge(): Convert the HashMap values into streams and grouping by gender and get average age.
		7. getHighestPerDetails(): Displays the details of student having highest percentage.
		8. getCountStudentDept(): Count number of student in each department and displays the result.
		9. getAvgDepartPercentage(): Calculate average percentage of each department.
		10.getYoungestMale(): Filter out the youngest males among males and display the result.
		11.getCountGenderCSE(): Display count of Male and Female students in Computer Science Department.
