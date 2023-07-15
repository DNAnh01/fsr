package javaot.bean;

import java.util.Arrays;

/**
 * 
 */
public class Student {
	private String id;
	private String fullName;
	private Integer age;
	private String country;
	private String[] operatingSystems;
	
	
	public Student() {
	}

	public Student(String id, String fullName, Integer age, String country, String[] operatingSystems) {
		this.id = id;
		this.fullName = fullName;
		this.age = age;
		this.country = country;
		this.operatingSystems = operatingSystems;
	}

	public void transfer(Student student) {
		this.id = student.id;
		this.fullName = student.fullName;
		this.age = student.age;
		this.country = student.country;
		this.operatingSystems = student.operatingSystems;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", age=" + age + ", country=" + country
				+ ", operatingSystems=" + Arrays.toString(operatingSystems) + "]";
	}
}	
