package studentDetails;


public class Student {

	int id;
	String name;
	int age;
	String gender;
	String engDepartment;
	int year_of_enrollment;
	double perTillDate;

	Student(int id, String name, int age, String gender, String engDepartment, int year_of_enrollment,
			double perTillDate) {

		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.engDepartment = engDepartment;
		this.year_of_enrollment = year_of_enrollment;
		this.perTillDate = perTillDate;

	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getEngDepartment() {
		return engDepartment;
	}

	public int getYearOfEnrollment() {
		return year_of_enrollment;
	}

	public double getPerTillDate() {
		return perTillDate;
	}
}
