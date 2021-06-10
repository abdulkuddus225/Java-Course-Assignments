package studentDetails;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Queries {

	private HashMap<Integer, Student> map = new HashMap<Integer, Student>();

	public Queries(HashMap<Integer, Student> map) {
		// TODO Auto-generated constructor stub
		this.map = map;
	}

	public void displayDepartments() {
		Set<String> department = map.values().stream().filter(s -> s.engDepartment.length() > 0)
				.map(s -> s.engDepartment).collect(Collectors.toSet());

		for (String s : department) {
			System.out.println(s);
		}

	}

	public void getStudentNames() {
		map.values().stream().filter(s -> s.year_of_enrollment > 2018).forEach(s -> System.out.println(s.name));
	}

	public void getAllMaleCSE() {
		map.values().stream().filter(s -> s.engDepartment.equals("Computer Science"))
				.filter(s -> s.gender.equals("Male"))
				.forEach(s -> System.out.println("Name: " + s.name + " Age: " + s.age + " Gender: " + s.gender
						+ " Department: " + s.engDepartment + " Year Of Enrollment: " + s.year_of_enrollment
						+ " Percentage: " + s.perTillDate));
	}

	public void getCountMaleFemale() {

		Map<String, Long> groupByGenderCount = map.values().stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));

		for (Map.Entry entry : groupByGenderCount.entrySet()) {
			System.out.println("Count of " + entry.getKey() + " is " + entry.getValue());
		}

	}

	public void getAvgAge() {

		Map<String, Double> averageAge = map.values().stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));

		for (Map.Entry entry : averageAge.entrySet()) {
			System.out.println("Average age of " + entry.getKey() + " is " + entry.getValue());
		}
	}

	public void getHighestPerDetails() {

		Optional<Student> highestPercentage = map.values().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getPerTillDate)));

		System.out.println("Name: " + highestPercentage.get().name + " Age: " + highestPercentage.get().age
				+ " Gender: " + highestPercentage.get().gender + " Department: " + highestPercentage.get().engDepartment
				+ " Year Of Enrollment: " + highestPercentage.get().year_of_enrollment + " Percentage: "
				+ highestPercentage.get().perTillDate);
		// System.out.println(highestPercentage);
	}

	public void getCountStudentDept() {

		Map<String, Long> countStudent = map.values().stream()
				.collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.counting()));

		for (Map.Entry entry : countStudent.entrySet()) {
			System.out.println("Department  " + entry.getKey() + " has " + entry.getValue());
		}

	}

	public void getAvgDepartPercentage() {

		Map<String, Double> averageDeptPercentage = map.values().stream().collect(
				Collectors.groupingBy(Student::getEngDepartment, Collectors.averagingDouble(Student::getPerTillDate)));

		for (Map.Entry entry : averageDeptPercentage.entrySet()) {
			System.out.println("Department  " + entry.getKey() + " has acheived " + entry.getValue());
		}

	}

	public void getYoungestMale() {

		Optional<Student> minimumAge = map.values().stream().filter(s -> s.gender.equals("Male"))
				.filter(s -> s.engDepartment.equals("Electronic"))
				.collect(Collectors.minBy(Comparator.comparing(Student::getAge)));

		System.out.println("Name: " + minimumAge.get().name + " Age: " + minimumAge.get().age + " Gender: "
				+ minimumAge.get().gender + " Department: " + minimumAge.get().engDepartment + " Year Of Enrollment: "
				+ minimumAge.get().year_of_enrollment + " Percentage: " + minimumAge.get().perTillDate);
	}

	public void getCountGenderCSE() {

		Map<String, Long> genderCountCSE = map.values().stream().filter(s -> s.engDepartment.equals("Computer Science"))
				.collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));

		for (Map.Entry entry : genderCountCSE.entrySet()) {
			System.out.println("Count of " + entry.getKey() + " is " + entry.getValue());
		}
	}

}
