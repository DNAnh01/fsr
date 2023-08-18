package javaot.bean;

import java.util.Arrays;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import validation.StartsWith;

/**
 * 
 */
public class Student {
	
	private String id;
	
	@NotNull(message = "Input cannot be empty!")
	@Size(min = 5, message = "Full name require at least 5 letters!")
	private String fullName;
	
	@NotNull(message = "Input cannot be empty!")
	private Integer age;
	
	private String country;
	
	private String[] operatingSystems;
	
	
//	@NotNull(message = "Input cannot be empty!")
	@StartsWith(prefix = "BKIT", message = "CourseName must start with BKIT")
	private String course;
	
	public Student() {
	}

	public Student(String id, String fullName, Integer age, String country, String[] operatingSystems, String course) {
		this.id = id;	
		this.fullName = fullName;
		this.age = age;
		this.country = country;
		this.operatingSystems = operatingSystems;
		this.course = course;
	}

	public void transfer(Student student) {
		this.id = student.id;
		this.fullName = student.fullName;
		this.age = student.age;
		this.country = student.country;
		this.operatingSystems = student.operatingSystems;
		this.course = student.course;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	public String getOsAsString() {
		return Arrays.toString(operatingSystems);
	}

	
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", age=" + age + ", country=" + country
				+ ", operatingSystems=" + Arrays.toString(operatingSystems) + ", course=" + course + "]";
	}
}