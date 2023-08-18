package javaot.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javaot.bean.Student;

public class MockData {
	private MockData() {

	}
	
	// Load data from DAO - Database

	public static List<Student> getStudents() {
		// nếu để như này thì nó sẽ không cho mình add vì Arrays.asList là fixed-size
//		return Arrays.asList(
//				new Student("102", "Adam", 22),
//				new Student("103", "Bichs", 12),
//				new Student("104", "Duyen", 24)
//		);

		return new ArrayList<Student>(Arrays.asList(
				new Student("102", "Adam", 22, "VietNam", new String[] {"Unix", "Mac OS"}, "BKIT-11"), 
				new Student("103", "Bichs", 12, "France", new String[] {"Unix", "Windows"}, "BKIT-12"),
				new Student("104", "Duyen", 24, "Thailand", new String[] {"Linux", "Mac OS"}, "BKIT-13")));
	}

	public static String[] getCountries() {
		return new String[] { 
				"VietNam", 
				"France", 
				"Gernany", 
				"Thailand" };
	}
	
	public static String[] getOses() {
		return new String[] { 
				"Unix", 
				"Mac OS", 
				"Windows", 
				"Linux" };
	}
}
