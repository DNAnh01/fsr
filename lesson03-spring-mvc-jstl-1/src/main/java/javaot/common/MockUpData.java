package javaot.common;

import java.util.Arrays;
import java.util.List;

import javaot.bean.Student;

public class MockUpData {
	private MockUpData() {

	}
	
	public static List<Student> getStudents() {
		return Arrays.asList(
				new Student("102", "Adam", 22),
				new Student("103", "Bichs", 12),
				new Student("104", "Duyen", 24)
		);
	}
}
