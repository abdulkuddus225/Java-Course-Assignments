package studentDetails;

import java.util.HashMap;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();

		map = init();

		Queries q1 = new Queries(map);
		q1.displayDepartments();
		q1.getStudentNames();
		q1.getAllMaleCSE();
		q1.getCountMaleFemale();
		q1.getCountMaleFemale();
		q1.getAvgDepartPercentage();
		q1.getCountGenderCSE();

	}

	private static HashMap<Integer, Student> init() {
		Student s1 = new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8);
		Student s2 = new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2);
		Student s3 = new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3);
		Student s4 = new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80);
		Student s5 = new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70);
		Student s6 = new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70);
		Student s7 = new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70);
		Student s8 = new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80);
		Student s9 = new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85);
		Student s10 = new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82);
		Student s11 = new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83);
		Student s12 = new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
		Student s13 = new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
		Student s14 = new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
		Student s15 = new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
		Student s16 = new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4);
		Student s17 = new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();

		map.put(s1.getId(), s1);
		map.put(s2.getId(), s2);
		map.put(s3.getId(), s3);
		map.put(s4.getId(), s4);
		map.put(s5.getId(), s5);
		map.put(s6.getId(), s6);
		map.put(s7.getId(), s7);
		map.put(s8.getId(), s8);
		map.put(s9.getId(), s9);
		map.put(s10.getId(), s10);
		map.put(s11.getId(), s11);
		map.put(s12.getId(), s12);
		map.put(s13.getId(), s13);
		map.put(s14.getId(), s14);
		map.put(s15.getId(), s15);
		map.put(s16.getId(), s16);
		map.put(s17.getId(), s17);

		return map;
	}

}
