package model;

import java.util.Arrays;
import java.util.List;

import bean.Customer;
import bean.Student;

public class DataModel {
    private DataModel() {

    }

    public static List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer("Nguyen Anh", "0852 501 333", "Hoa Khanh"),
                new Customer("Van Nam", "0932 487 234", "Son Tra"),
                new Customer("Hoai Phuong", "0342 643 134", "Cam le"),
                new Customer("Truong Giang", "0234 524 234", "Cao Bang"));
    }

    public static List<Student> getStudents() {
        return Arrays.asList(
                new Student("Nguyen Anh", "0852 501 333", 20),
                new Student("Van Nam", "0932 487 234", 20),
                new Student("Hoai Phuong", "0342 643 134", 20),
                new Student("Truong Giang", "0234 524 234", 20));
    }
}
