package bean;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String fullName;
    private String phone;
    private int age;

    public Student() {
    }

    public Student(String fullName, String phone, int age) {
        this.fullName = fullName;
        this.phone = phone;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toLine() {
        return String.join(", ", getFullName(), getPhone(), getAge() + "\n");
    }

    @Override
    public String toString() {
        return "Student [fullName=" + fullName + ", phone=" + phone + ", age=" + age + "]";
    }

}
